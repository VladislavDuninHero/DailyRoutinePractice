package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Stack;

//Link: https://leetcode.com/problems/removing-stars-from-a-string/description/
//Description:
//You are given a string s, which contains stars *.
//
//In one operation, you can:
//
//Choose a star in s.
//Remove the closest non-star character to its left, as well as remove the star itself.
//Return the string after all stars have been removed.
//
//Note:
//
//The input will be generated such that the operation is always possible.
//It can be shown that the resulting string will always be unique.
//
//
//Example 1:
//
//Input: s = "leet**cod*e"
//Output: "lecoe"
//Explanation: Performing the removals from left to right:
//- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//There are no more stars, so we return "lecoe".

public class RemovingStarsFromAString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String strWithStars = "leet**cod*e";

        String strWithoutStars = removeStars(strWithStars);

        System.out.println(strWithoutStars);
    }

    //Runtime: beats 55% of other solutions.
    //Memory: beats 41% of other solutions.
    //Time complexity: O(n).
    private String removeStars(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
                continue;
            }

            stack.pop();
        }


        StringBuilder builder = new StringBuilder();
        for (Character word : stack) {
            if (word != '*') {
                builder.append(word);
            }
        }


        return builder.toString();
    }
}
