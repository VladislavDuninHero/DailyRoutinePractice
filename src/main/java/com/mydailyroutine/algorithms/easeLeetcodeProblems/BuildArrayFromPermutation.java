package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class BuildArrayFromPermutation implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 0, 2, 3, 5, 1};

        int[] result = buildArray(nums);

        System.out.println(Arrays.toString(result));
    }

    private int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }

        return newArray;
    }
}
