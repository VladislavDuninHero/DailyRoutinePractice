package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
//
//
//Example 1:
//
//Input: n = 5
//Output: 10
//Explanation: The smallest multiple of both 5 and 2 is 10.

public class SmallestEvenMultiple implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int n = 77;

        int smallestEvenMultiple = smallestEvenMultiple(n);

        System.out.println(smallestEvenMultiple);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 26% of other solutions.
    private int smallestEvenMultiple(int n) {
        int nok = 1;

        int i = 1;
        while (true) {
            if (i % n == 0 && i % 2 == 0) {
                nok = i;
                break;
            }
            i++;
        }

        return nok;
    }
}
