package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Description:
//A distinct string is a string that is present only once in an array.
//
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
//
//Note that the strings are considered in the order in which they appear in the array.
//
//
//
//Example 1:
//
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned.
//Example 2:
//
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.
//Example 3:
//
//Input: arr = ["a","b","a"], k = 3
//Output: ""
//Explanation:
//The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string ""

public class KthDistinctStringInAnArray implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String[] array = {"d", "b", "c", "b", "c", "a"};
        int k = 2;

        String distinctElement = kthDistinct(array, k);

        System.out.println(distinctElement);
    }

    //Runtime: beat 5% of other solutions.
    //Memory: beat 20% of other solutions.
    private String kthDistinct(String[] arr, int k) {

        List<String> list = new ArrayList<>();

        int[] indexArray = new int[arr.length];

        for (int i = 0; i < indexArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    indexArray[i]++;
                }
            }
        }

        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i] == 1) {
                list.add(arr[i]);
            }
        }

        if (k > list.size()) {
            return "";
        }

        return list.get(k - 1);
    }
}

