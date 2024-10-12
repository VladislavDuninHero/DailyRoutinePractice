package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Description:
//You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
//
//Sort the values at odd indices of nums in non-increasing order.
//For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
//Sort the values at even indices of nums in non-decreasing order.
//For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
//Return the array formed after rearranging the values of nums.
//
//
//
//Example 1:
//
//Input: nums = [4,1,2,3]
//Output: [2,3,4,1]
//Explanation:
//First, we sort the values present at odd indices (1 and 3) in non-increasing order.
//So, nums changes from [4,1,2,3] to [4,3,2,1].
//Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
//So, nums changes from [4,1,2,3] to [2,3,4,1].
//Thus, the array formed after rearranging the values is [2,3,4,1].

public class SortEvenAndOddIndicesIndependently implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {4, 1, 2, 3};

        int[] sorted = sortEvenOdd(nums);

        System.out.println(Arrays.toString(sorted));
    }

    //Runtime: beats 49%.
    //Memory: beats 98%.
    private int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) {
            return nums;
        }

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        int[] bufferNums = new int[nums.length];

        for (int i = 0; i < bufferNums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
                continue;
            }

            odd.add(nums[i]);
        }

        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(odd);

        int k = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                bufferNums[i] = even.get(j++);
                continue;
            }

            bufferNums[i] = odd.get(k++);
        }

        return bufferNums;
    }

}

