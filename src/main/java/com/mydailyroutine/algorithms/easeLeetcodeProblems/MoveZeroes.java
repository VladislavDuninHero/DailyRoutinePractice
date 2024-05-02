package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class MoveZeroes implements AlgosActionDispatcher {

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //
    //Note that you must do this in-place without making a copy of the array.

    @Override
    public void execute() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int elementIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[elementIndex] = nums[i];
                elementIndex++;
            }
        }

        while (elementIndex != nums.length) {
            nums[elementIndex] = 0;
            elementIndex++;
        }
    }
}
