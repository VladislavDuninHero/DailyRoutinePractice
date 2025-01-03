package com.mydailyroutine.algorithms.mediumLeetcodeProblems;


import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashSet;
import java.util.Set;

//Link: https://leetcode.com/problems/optimal-partition-of-string/description/
//Description:
//Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
//
//Return the minimum number of substrings in such a partition.
//
//Note that each character should belong to exactly one substring in a partition.
//
//
//
//Example 1:
//
//Input: s = "abacaba"
//Output: 4
//Explanation:
//Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
//It can be shown that 4 is the minimum number of substrings needed.

public class OptimalPartitionOfString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "abacaba";

        int partitions = partitionString(s);

        System.out.println(partitions);
    }

    //Runtime: beats 28% of other solutions.
    //Memory: beats 21% of other solutions.
    //Time complexity: O(n).
    private int partitionString(String s) {

        Set<Character> chars = new HashSet<>();

        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                chars.clear();
                chars.add(s.charAt(i));
                counter++;
            } else {
                chars.add(s.charAt(i));
            }
        }

        return counter;
    }

}
