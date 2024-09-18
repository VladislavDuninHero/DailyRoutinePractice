package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
//
//In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
//Note that 0 is neither positive nor negative.
//
//
//
//Example 1:
//
//Input: nums = [-2,-1,-1,1,2,3]
//Output: 3
//Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

public class MaximumCountOfPositiveIntegerAndNegativeInteger implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};

        int count = maximumCount(nums);

        System.out.println(count);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 16% of other solutions.
    private int maximumCount(int[] nums) {

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeCount++;
            }

            if (nums[i] > 0) {
                positiveCount++;
            }
        }

        return Math.max(positiveCount, negativeCount);
    }
}
