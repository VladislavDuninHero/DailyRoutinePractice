package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//For example, if s = "abcde", then it will be "bcdea" after one shift.
//
//
//Example 1:
//
//Input: s = "abcde", goal = "cdeab"
//Output: true

//Approach:
//1. Check Lengths: First, check if the lengths of s and goal are equal. If they are not, goal cannot be a rotation of s, so return false immediately.
//
//2. Concatenate s with Itself: By concatenating s with itself (s + s), you create a new string that contains every possible rotation of s.
//
//3. Check for Substring:
//
//Use the contains method to check if the goal is a substring of the concatenated string (s + s).
//If the goal is found as a substring, return true. Otherwise, return false.

public class RotateString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "abcde";
        String goal = "bcdea";

        System.out.println(rotateString(s, goal));
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 51% of other solutions.
    private boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        s += s;

        return s.contains(goal);
    }
}
