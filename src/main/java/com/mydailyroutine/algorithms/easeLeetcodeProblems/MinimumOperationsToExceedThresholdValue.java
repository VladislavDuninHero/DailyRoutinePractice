package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class MinimumOperationsToExceedThresholdValue implements AlgosActionDispatcher {

    //Description:
    //You are given a 0-indexed integer array nums, and an integer k.
    //
    //In one operation, you can remove one occurrence of the smallest element of nums.
    //
    //Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [2,11,10,1,3], k = 10
    //Output: 3
    //Explanation: After one operation, nums becomes equal to [2, 11, 10, 3].
    //After two operations, nums becomes equal to [11, 10, 3].
    //After three operations, nums becomes equal to [11, 10].
    //At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
    //It can be shown that 3 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.

    @Override
    public void execute() {
        int[] nums = {1, 1, 3, 5, 6, 9};
        int k = 6;

        int result = minOperations(nums, k);

        System.out.println(result);
    }

    private int minOperations(int[] nums, int k) {
        int counter = 0;
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            if (nums[head] < k) {
                counter++;
            }

            if (nums[tail] < k && head != tail) {
                counter++;
            }

            head++;
            tail--;
        }

        return counter;
    }
}
