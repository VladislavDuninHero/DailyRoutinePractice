package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Link: https://leetcode.com/problems/top-k-frequent-elements/description/
//Description:
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]

public class TopKFrequentElements implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;

        int[] topFrequentNums = topKFrequent(nums, k);

        System.out.println(Arrays.toString(topFrequentNums));
    }

    //Runtime: beats 10% of other solutions.
    //Memory: beats 41% of other solutions.
    //Time complexity: O (n + m log m).
    private int[] topKFrequent(int[] nums, int k) {

        if (nums.length <= 1) {
            return nums;
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        int[] topFrequentNums = new int[k];

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> listForSort = new ArrayList<>(frequency.entrySet());

        listForSort.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(listForSort);

        for (int i = 0; i < k; i++) {
            topFrequentNums[i] = listForSort.get(i).getKey();
        }

        return topFrequentNums;
    }
}
