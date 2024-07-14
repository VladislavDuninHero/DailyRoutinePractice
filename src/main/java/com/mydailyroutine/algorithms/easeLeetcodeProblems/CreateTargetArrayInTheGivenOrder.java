package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder implements AlgosActionDispatcher {

    public void execute() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] indexes = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, indexes)));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            System.out.println(index[i]);
            System.out.println(nums[i]);
            target[index[i]] = nums[i];
        }

        return target;
    }
}
