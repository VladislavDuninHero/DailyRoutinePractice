package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Link: https://leetcode.com/problems/left-and-right-sum-differences/description/
//Description:
//Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
//
//answer.length == nums.length.
//answer[i] = |leftSum[i] - rightSum[i]|.
//Where:
//
//leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
//rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
//Return the array answer.
//
//
//
//Example 1:
//
//Input: nums = [10,4,8,3]
//Output: [15,1,11,22]
//Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
//The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

public class LeftAndRightSumDifferences implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {10, 4, 8, 3};

        int[] difference = leftRightDifference(nums);

        System.out.println(Arrays.toString(difference));
    }

    //Runtime: beats 5% of other solutions.
    //Memory: beats 17% of other solutions.
    //Time complexity: O(n^2).
    private int[] leftRightDifference(int[] nums) {
        int[] differenceArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums, i) < rightSum(nums, i)) {
                differenceArray[i] = rightSum(nums, i) - leftSum(nums, i);
                continue;
            }

            differenceArray[i] = leftSum(nums, i) - rightSum(nums, i);
        }

        return differenceArray;
    }


    private int leftSum(int[] nums, int index) {
        int sum = 0;

        if (index == 0) {
            return sum;
        }

        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }

        return sum;
    }

    private int rightSum(int[] nums, int index) {
        int sum = 0;

        if (index == nums.length) {
            return sum;
        }

        for (int i = nums.length - 1; i > index; i--) {
            sum += nums[i];
        }

        return sum;
    }

}
