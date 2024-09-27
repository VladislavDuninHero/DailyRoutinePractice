package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
//
//
//Example 1:
//
//Input: nums = [3,4,5,2]
//Output: 12
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.

public class MaximumProductOfTwoElementsInAnArray implements AlgosActionDispatcher {
    @Override
    public void execute() {
        int[] nums = {3, 4, 5, 2};

        int maximumProduct = maxProduct(nums);

        System.out.println(maximumProduct);
    }

    //Runtime: beats 20% of other solutions.
    //Memory: beats 79% of other solutions.
    private int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int current = (nums[i] - 1) * (nums[j] - 1);

                if (current > max) {
                    max = current;
                }
            }
        }

        return max;
    }
}
