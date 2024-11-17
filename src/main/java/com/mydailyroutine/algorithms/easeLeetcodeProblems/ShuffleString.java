package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


//Link: https://leetcode.com/problems/shuffle-string/description/
//Description:
//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//
//Return the shuffled string.
//
//
//
//Example 1:
//
//
//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"
//Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

public class ShuffleString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s = "codeleet";

        String restoreString = restoreString(s, indices);

        System.out.println(restoreString);
    }

    //Runtime: beats 11% of other solutions.
    //Memory: beats 88% of other solutions.
    //Time complexity: O(n^2).
    private String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    builder.append(chars[j]);
                }
            }
        }

        return builder.toString();
    }
}
