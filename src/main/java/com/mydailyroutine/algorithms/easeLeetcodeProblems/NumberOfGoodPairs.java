package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//Link: https://leetcode.com/problems/number-of-good-pairs/description/

public class NumberOfGoodPairs implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int countOfPairs = numIdenticalPairs(nums);

        System.out.println(countOfPairs);
    }

    //Runtime: beats 88% of other solutions.
    //Memory: beats 52% of other solutions.
    //Time complexity: O(n^2).
    private int numIdenticalPairs(int[] nums) {
        int countOfPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    countOfPairs++;
                }
            }
        }

        return countOfPairs;
    }
}
