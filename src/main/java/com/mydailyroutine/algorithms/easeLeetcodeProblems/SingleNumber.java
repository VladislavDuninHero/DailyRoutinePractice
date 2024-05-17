package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber implements AlgosActionDispatcher {

    //Description:
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //
    //You must implement a solution with a linear runtime complexity and use only constant extra space.

    @Override
    public void execute() {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(getSingleNumber(nums));
        System.out.println(getSingleNumberWithBitwiseOperation(nums));
    }

    //Main solution, Memory: beats 84.98% users with java
    private int getSingleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                continue;
            }

            map.put(nums[i], 1);
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> num : map.entrySet()) {
            if (num.getValue() == 1) {
                result = num.getKey();
            }
        }

        return result;
    }

    //Alternative solution, high speed
    private int getSingleNumberWithBitwiseOperation(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }

}
