package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//Example 1:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation:
//
//The strings s and t can be made identical by:
//
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.

public class IsomorphicStrings implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = isIsomorphic(s, t);

        System.out.println(isIsomorphic);
    }

    private boolean isIsomorphic(String s, String t) {

        int[] sIndexArray = new int[256];
        int[] tIndexArray = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (sIndexArray[s.charAt(i)] != tIndexArray[t.charAt(i)]) {
                return false;
            }

            sIndexArray[s.charAt(i)] = i + 1;
            tIndexArray[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
