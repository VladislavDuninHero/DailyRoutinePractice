package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given a string s, reverse the string according to the following rules:
//
//All the characters that are not English letters remain in the same position.
//All the English letters (lowercase or uppercase) should be reversed.
//Return s after reversing it.
//
//
//
//Example 1:
//
//Input: s = "ab-cd"
//Output: "dc-ba"

public class ReverseOnlyLetters implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "a-bC-dEf-ghIj";

        String reversed = reverseOnlyLetters(s);

        System.out.println(reversed);
    }

    //Runtime: beats 39% of other solutions.
    //Memory: beats 31% of other solutions.
    private String reverseOnlyLetters(String s) {
        char[] stringToCharArray = s.toCharArray();

        int head = 0;
        int tail = stringToCharArray.length - 1;

        while (head < tail) {

            if (Character.isLetter(stringToCharArray[head]) && Character.isLetter(stringToCharArray[tail])) {
                char temp = stringToCharArray[head];
                stringToCharArray[head] = stringToCharArray[tail];
                stringToCharArray[tail] = temp;
                head++;
                tail--;
                continue;
            }

            if (!Character.isLetter(stringToCharArray[head]) && Character.isLetter(stringToCharArray[tail])) {
                head++;
                continue;
            }

            if (!Character.isLetter(stringToCharArray[tail]) && Character.isLetter(stringToCharArray[head])) {
                tail--;
                continue;
            }

            head++;
            tail--;

        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < stringToCharArray.length; i++) {
            builder.append(stringToCharArray[i]);
        }

        return builder.toString();
    }
}
