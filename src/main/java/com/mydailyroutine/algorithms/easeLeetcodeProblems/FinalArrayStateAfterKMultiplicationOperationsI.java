package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        int[] finalState = getFinalState(nums, k, multiplier);

        System.out.println(Arrays.toString(finalState));
    }

    private int[] getFinalState(int[] nums, int k, int multiplier) {

        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));

        for (int i = 0, copyPointer = 0; i < k; i++, copyPointer++) {
            int startIndex = copy[copyPointer];

            for (int j = 0; j < nums.length; j++) {
                if (startIndex == nums[j]) {
                    nums[j] = nums[j] * multiplier;
                    break;
                }
            }

        }

        return nums;
    }
}
