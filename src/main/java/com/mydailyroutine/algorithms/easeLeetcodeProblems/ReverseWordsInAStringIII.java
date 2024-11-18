package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


//Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
//Description:
//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//
//
//Example 1:
//
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"

public class ReverseWordsInAStringIII implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "Let's take LeetCode contest";

        String reverseWords = reverseWords(s);

        System.out.println(reverseWords);
    }

    //Runtime: beats 25% of other solutions.
    //Memory: beats 64% of other solutions.
    //Time complexity: O(n)
    private String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            char[] chars = words[i].toCharArray();
            StringBuilder charBuilder = new StringBuilder();

            int head = 0;
            int tail = chars.length - 1;
            while (head <= tail) {
                char leftChar = chars[head];
                char rightChar = chars[tail];
                chars[head] = rightChar;
                chars[tail] = leftChar;
                head++;
                tail--;
            }

            for (Character c : chars) {
                charBuilder.append(c);
            }

            words[i] = charBuilder.toString();
        }

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);

            if (i < words.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
