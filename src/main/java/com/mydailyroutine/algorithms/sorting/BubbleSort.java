package com.mydailyroutine.algorithms.sorting;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class BubbleSort implements AlgosActionDispatcher {
    @Override
    public void execute() {
        int[] nums = {2, 3, 1};

        bubbleSortRun(nums);
    }

    private void bubbleSortRun(int[] nums) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i <= nums.length - 1; i++) {
                if (nums[i] < nums[i - 1]) {
                    isSorted = false;
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
