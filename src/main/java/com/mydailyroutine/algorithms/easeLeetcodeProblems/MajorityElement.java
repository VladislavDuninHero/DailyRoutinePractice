package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement implements AlgosActionDispatcher {

    //Description:
    //Given an array nums of size n, return the majority element.
    //
    //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    @Override
    public void execute() {
        int[] nums = {8, 8, 7, 7, 7};

        int result = findMajorityElement(nums);
        System.out.println(result);
    }

    private int findMajorityElement(int[] nums) {

        Map<Integer, Integer> statisticOfElements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (statisticOfElements.containsKey(nums[i])) {
                statisticOfElements.put(nums[i], statisticOfElements.get(nums[i]) + 1);
                continue;
            }

            statisticOfElements.put(nums[i], 1);
        }

        int max = 1;
        int majorityNum = nums[0];

        for (Map.Entry<Integer, Integer> data : statisticOfElements.entrySet()) {
            if (data.getValue() > max) {
                max = data.getValue();
                majorityNum = data.getKey();
            }

        }

        return majorityNum;
    }
}
