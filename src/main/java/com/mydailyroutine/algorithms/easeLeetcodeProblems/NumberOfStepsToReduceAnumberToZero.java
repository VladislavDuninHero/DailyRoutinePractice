package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class NumberOfStepsToReduceAnumberToZero implements AlgosActionDispatcher {

    //Description:
    //Given an integer num, return the number of steps to reduce it to zero.
    //
    //In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    //
    //
    //
    //Example 1:
    //
    //Input: num = 14
    //Output: 6
    //Explanation:
    //Step 1) 14 is even; divide by 2 and obtain 7.
    //Step 2) 7 is odd; subtract 1 and obtain 6.
    //Step 3) 6 is even; divide by 2 and obtain 3.
    //Step 4) 3 is odd; subtract 1 and obtain 2.
    //Step 5) 2 is even; divide by 2 and obtain 1.
    //Step 6) 1 is odd; subtract 1 and obtain 0.

    int count = 0;

    @Override
    public void execute() {
        System.out.println(numberOfSteps(14));
    }

    //Runtime: beats 100%
    //Memory: beats 71.81%
    public int numberOfSteps(int num) {
        if (num == 0) {
            return count;
        }

        if (numIsEven(num)) {
            count++;
           return numberOfSteps(num / 2);
        }

        count++;
        return numberOfSteps(num - 1);
    }

    private boolean numIsEven(int num) {
        return num % 2 == 0;
    }
}
