package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class SubtractTheProductAndSumOfDigitsOfAnInteger implements AlgosActionDispatcher {

    //Description:
    //Given an integer number n, return the difference between the product of its digits and the sum of its digits.
    //
    //
    //Example 1:
    //
    //Input: n = 234
    //Output: 15
    //Explanation:
    //Product of digits = 2 * 3 * 4 = 24
    //Sum of digits = 2 + 3 + 4 = 9
    //Result = 24 - 9 = 15
    //Example 2:
    //
    //Input: n = 4421
    //Output: 21
    //Explanation:
    //Product of digits = 4 * 4 * 2 * 1 = 32
    //Sum of digits = 4 + 4 + 2 + 1 = 11
    //Result = 32 - 11 = 21

    @Override
    public void execute() {
        int n = 234;

        System.out.println(subtractProductAndSum(n));
    }

    //Runtime: beats 100.00% of users with Java
    //Memory: beats 94.77% of users with Java
    private int subtractProductAndSum(int n) {

        int multiply = 1;
        int sum = 0;

        String[] split = String.valueOf(n).split("");

        for (int i = 0; i < split.length; i++) {
            multiply *= Integer.parseInt(split[i]);
        }

        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }

        int result = multiply - sum;

        return result;
    }
}

