package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//You are given an integer array nums, an integer k, and an integer multiplier.
//
//You need to perform k operations on nums. In each operation:
//
//Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
//Replace the selected minimum value x with x * multiplier.
//Return an integer array denoting the final state of nums after performing all k operations.
//
//
//
//Example 1:
//
//Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
//
//Output: [8,4,6,5,6]
//
//Explanation:
//
//Operation	Result
//After operation 1	[2, 2, 3, 5, 6]
//After operation 2	[4, 2, 3, 5, 6]
//After operation 3	[4, 4, 3, 5, 6]
//After operation 4	[4, 4, 6, 5, 6]
//After operation 5	[8, 4, 6, 5, 6]

public class FinalArrayStateAfterKMultiplicationOperationsI implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        int[] finalState = getFinalState(nums, k, multiplier);

        System.out.println(Arrays.toString(finalState));
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 85% of other solutions.
    //Time complexity: O(k * n).
    private int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    index = i;
                }
            }

            nums[index] = nums[index] * multiplier;
            k--;
        }

        return nums;
    }
}
