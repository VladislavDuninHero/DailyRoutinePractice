package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//You are given a string num consisting of only digits. A string of digits is called balanced if the sum of the digits at even indices is equal to the sum of digits at odd indices.
//
//Return true if num is balanced, otherwise return false.
//
//
//
//Example 1:
//
//Input: num = "1234"
//
//Output: false
//
//Explanation:
//
//The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
//Since 4 is not equal to 6, num is not balanced.
//Link: https://leetcode.com/problems/check-balanced-string/description/

public class CheckBalancedString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String num = "24123";

        boolean isBalanced = isBalanced(num);

        System.out.println(isBalanced);
    }

    //Runtime: beats 99% of other solutions.
    //Memory: beats 41% of other solutions.
    //Time complexity: O(n).
    private boolean isBalanced(String num) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {

            int currentNum = Character.getNumericValue(num.charAt(i));

            if (i % 2 == 0) {
                evenSum += currentNum;
                continue;
            }

            oddSum += currentNum;
        }

        return evenSum == oddSum;
    }
}
