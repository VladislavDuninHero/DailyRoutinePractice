package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashSet;
import java.util.Set;

//Description:
//You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
//
//Return the number of consistent strings in the array words.
//
//
//
//Example 1:
//
//Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//Output: 2
//Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

public class CountTheNumberOfConsistentStrings implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        int countOfConsistentStrings = countConsistentStrings(allowed, words);

        System.out.println(countOfConsistentStrings);
    }

    private int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        Set<Character> allowedList = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            allowedList.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowedList.contains(words[i].charAt(j))) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
