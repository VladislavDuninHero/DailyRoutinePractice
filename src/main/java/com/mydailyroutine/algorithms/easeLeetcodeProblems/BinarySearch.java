package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4

public class BinarySearch implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int target = 9;
        int[] nums = {-1, 0, 3, 5, 9, 12};

        int num = search(nums, target);
        System.out.println(num);
    }

    //Runtime: beats 100% of other submissions runtime.
    //Memory: beats 95% of other submissions memory.
    private int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];

            if (guess == target) {
                return mid;
            }

            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
