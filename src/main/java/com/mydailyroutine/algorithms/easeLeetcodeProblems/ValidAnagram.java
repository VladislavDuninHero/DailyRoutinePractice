package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//Given two strings s and t, return true if t is an
//anagram
// of s, and false otherwise.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true

public class ValidAnagram implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String anagram = "anagram";
        String text = "nagaram";

        boolean isAnagram = isAnagram(anagram, text);
        System.out.println(isAnagram);
    }

    //Runtime: beats 5%.
    //Memory: beats 5%.
    private boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        String[] sSplit = s.split("");
        String[] tSplit = t.split("");

        Arrays.sort(sSplit);
        Arrays.sort(tSplit);

        for (int i = 0; i < sSplit.length; i++) {
            if (!sSplit[i].equals(tSplit[i])) {
                return false;
            }
        }

        return true;
    }
}
