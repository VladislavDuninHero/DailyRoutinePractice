package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Description:
//You are given a 0-indexed integer array nums and a target element target.
//
//A target index is an index i such that nums[i] == target.
//
//Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
//
//
//
//Example 1:
//
//Input: nums = [1,2,5,2,3], target = 2
//Output: [1,2]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The indices where nums[i] == 2 are 1 and 2.

public class FindTargetIndicesAfterSortingArray implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> targetIndices = targetIndices(nums, target);

        System.out.println(targetIndices);
    }

    //Runtime: beats 85%.
    //Memory: beats 46%.
    private List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> targetIndices = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndices.add(i);
            }
        }

        return targetIndices;
    }
}
