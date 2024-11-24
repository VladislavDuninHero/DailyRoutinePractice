package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Link: https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
//Description:
//You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
//
//The 2D array should contain only the elements of the array nums.
//Each row in the 2D array contains distinct integers.
//The number of rows in the 2D array should be minimal.
//Return the resulting array. If there are multiple answers, return any of them.
//
//Note that the 2D array can have a different number of elements on each row.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,1,2,3,1]
//Output: [[1,3,4,2],[1,3],[1]]
//Explanation: We can create a 2D array that contains the following rows:
//- 1,3,4,2
//- 1,3
//- 1
//All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
//It can be shown that we cannot have less than 3 rows in a valid array.

public class ConvertAnArrayIntoA2DArrayWithConditions implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] array = {9, 8, 8, 4, 9, 8, 8, 3, 9};

        List<List<Integer>> matrix = findMatrix(array);

        System.out.println(matrix);
    }

    //Runtime: beats 29% of other solutions runtime.
    //Memory: beats 11% of other solutions runtime.
    //Time complexity: O(n + m^2).
    private List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> matrix = new ArrayList<>();

        Map<Integer, Integer> statistic = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!statistic.containsKey(nums[i])) {
                statistic.put(nums[i], 1);
                continue;
            }

            statistic.put(nums[i], statistic.get(nums[i]) + 1);
        }

        boolean isOver = false;
        while (!isOver) {
            List<Integer> row = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : statistic.entrySet()) {

                if (!row.contains(entry.getKey()) && entry.getValue() > 0) {
                    row.add(entry.getKey());

                    statistic.put(entry.getKey(), entry.getValue() - 1);
                }
            }

            matrix.add(row);

            for (Integer value : statistic.values()) {
                isOver = true;

                if (value > 0) {
                    isOver = false;
                    break;
                }
            }
        }

        return matrix;
    }
}
