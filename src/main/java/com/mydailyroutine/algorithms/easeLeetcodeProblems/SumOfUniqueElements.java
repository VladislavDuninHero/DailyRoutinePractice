package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

//Description:
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.

public class SumOfUniqueElements implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3, 2};

        int sum = sumOfUnique(nums);
        int altSum = alternativeSumOfUnique(nums);

        System.out.println(sum);
        System.out.println(altSum);
    }

    private int sumOfUnique(int[] nums) {

        int sum = 0;
        int head = 0;
        int tail = 0;

        while (head < nums.length) {
            if (nums[head] == nums[tail] && head != tail) {
                head++;
                tail = 0;
                continue;
            }

            if (tail == nums.length - 1) {
                sum += nums[head];
                head++;
                tail = 0;
                continue;
            }

            tail++;
        }

        return sum;
    }

    private int alternativeSumOfUnique(int[] nums) {

        Map<Integer, Integer> mapOfNums = new HashMap<>();

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (mapOfNums.containsKey(nums[i])) {
                mapOfNums.put(nums[i], mapOfNums.get(nums[i]) + 1);
                continue;
            }

            mapOfNums.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapOfNums.entrySet()) {
            if (entry.getValue() < 2) {
                sum += entry.getKey();
            }
        }

        return sum;
    }
}
