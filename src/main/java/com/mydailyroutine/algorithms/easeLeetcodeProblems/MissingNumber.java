package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class MissingNumber implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int missingNumber = missingNumber(nums);

        System.out.println(missingNumber);
    }

    private int missingNumber(int[] nums) {
        int missingNumber = 0;

        Arrays.sort(nums);

        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] - 1 != nums[i]) {
                missingNumber = nums[i] - 1;
            }
        }

        return missingNumber;
    }
}
