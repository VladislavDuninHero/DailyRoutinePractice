package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOnlyVowelsInString implements AlgosActionDispatcher {
    private String text = "Java execute";
    @Override
    public void execute() {
       String result = reverseVowels(text);

       System.out.println(result);
    }


    private String reverseVowels(String s) {
        List<String> vowels = new ArrayList<>();
        Collections.addAll(vowels, "a", "e", "u", "i", "o");
        String[] sArray = s.split("");


        int head = 0;
        int tail = sArray.length - 1;

        while (head <= tail) {
            if (vowels.contains(sArray[head].toLowerCase()) && vowels.contains(sArray[tail].toLowerCase())) {
                String tmp = sArray[head];
                sArray[head] = sArray[tail];
                sArray[tail] = tmp;

                head++;

                if (tail > 0) {
                    tail--;
                }
            }

            if (head < tail && !vowels.contains(sArray[head].toLowerCase())) {
                head++;
            }
            if (!vowels.contains(sArray[tail].toLowerCase())) {
                tail--;
            }

        }

        return String.join("", sArray);
    }
}
