package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
//
//You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
//
//
//
//Example 1:
//
//Input: nums = [1]
//
//Output: true
//
//Explanation:
//
//There is only one element. So the answer is true.

public class SpecialArrayI implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {2, 1, 4};

        boolean isArraySpecial = isArraySpecial(nums);

        System.out.println(isArraySpecial);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 75% of other solutions.
    //Time complexity: O(n)
    private boolean isArraySpecial(int[] nums) {
        boolean isArraySpecial = false;

        for (int i = 1; i <= nums.length - 1; i++) {
            isArraySpecial = false;

            if (nums[i - 1] % 2 == 0 && nums[i] % 2 != 0 || nums[i] % 2 == 0 && nums[i - 1] % 2 != 0) {
                isArraySpecial = true;
            }

            if (!isArraySpecial) {
                return false;
            }
        }

        return true;
    }
}
