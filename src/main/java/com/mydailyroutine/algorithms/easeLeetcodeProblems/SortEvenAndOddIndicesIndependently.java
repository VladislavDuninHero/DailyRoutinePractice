package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {4, 1, 2, 3};

        int[] sorted = sortEvenOdd(nums);

        System.out.println(Arrays.toString(sorted));
    }

    private int[] sortEvenOdd(int[] nums) {

        sortedOddIndices(nums);

        return new int[1];
    }

    private int[] sortedOddIndices(int[] nums) {
        int[] buffer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                buffer[i] = nums[i];
            }
        }

        int numsHead = 0;
        int bufferTail = buffer.length - 1;


        System.out.println(Arrays.toString(nums));

        return new int[1];
    }

    private int[] sortedEvenIndices(int[] nums) {


        return new int[1];
    }
}
