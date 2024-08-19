package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
//
//The value of |x| is defined as:
//
//x if x >= 0.
//-x if x < 0.
//
//
//Example 1:
//
//Input: nums = [1,2,2,1], k = 1
//Output: 4
//Explanation: The pairs with an absolute difference of 1 are:
//- [1,2,2,1]
//- [1,2,2,1]
//- [1,2,2,1]
//- [1,2,2,1]

public class CountNumberOfPairsWithAbsoluteDifferenceK implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 2, 1};
        int k = 1;

        int resultNumber = countKDifference(nums, k);

        System.out.println(resultNumber);
    }

    //Runtime: beats 94% of other submissions runtime.
    //Memory: beats 74% of other submissions runtime.
    private int countKDifference(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] - nums[j] == k) {
                    count++;
                }
            }
        }

        return count;
    }

}
