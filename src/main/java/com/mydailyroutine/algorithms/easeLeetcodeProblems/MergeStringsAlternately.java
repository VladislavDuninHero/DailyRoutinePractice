package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Link: https://leetcode.com/problems/merge-strings-alternately/description/
//Description:
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r

public class MergeStringsAlternately implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String wordFirst = "ab";
        String wordSecond = "pqrs";

        String merged = mergeAlternately(wordFirst, wordSecond);

        System.out.println(merged);
    }


    //Runtime: beats 83% of other solutions.
    //Memory: beats 74% of other solutions.
    //Time complexity: O(n + m)
    private String mergeAlternately(String word1, String word2) {
        int newStringLength = word1.length() + word2.length();
        StringBuilder builder = new StringBuilder();

        int leftStringHead = 0;
        int rightStringHead = 0;
        int i = 0;

        while (i < newStringLength) {
            if (leftStringHead < word1.length()) {
                builder.append(word1.charAt(leftStringHead));
                leftStringHead++;
            }

            if (rightStringHead < word2.length()) {
                builder.append(word2.charAt(rightStringHead));
                rightStringHead++;
            }

            i++;
        }

        return builder.toString();
    }
}
