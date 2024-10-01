package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
//Example 3:
//
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true

public class CheckIfTwoStringArraysAreEquivalent implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String[] wordOne = {"ab", "c"};
        String[] wordTwo = {"a", "bc"};

        boolean isEquivalent = arrayStringsAreEqual(wordOne, wordTwo);


        System.out.println(isEquivalent);
    }


    //Runtime: beats 100% of other solutions runtime.
    //Memory: beats 80% of other solutions runtime.
    private boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builderOne = new StringBuilder();
        StringBuilder builderTwo = new StringBuilder();

        for (String string : word1) {
            builderOne.append(string);
        }

        for (String s : word2) {
            builderTwo.append(s);
        }

        return builderOne.toString().contentEquals(builderTwo);
    }

}

