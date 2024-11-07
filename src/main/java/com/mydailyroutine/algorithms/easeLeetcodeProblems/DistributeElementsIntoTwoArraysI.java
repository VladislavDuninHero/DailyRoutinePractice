package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Description:
//Link: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/
//You are given a 1-indexed array of distinct integers nums of length n.
//
//You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:
//
//If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
//The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].
//
//Return the array result.
//
//
//
//Example 1:
//
//Input: nums = [2,1,3]
//Output: [2,3,1]
//Explanation: After the first 2 operations, arr1 = [2] and arr2 = [1].
//In the 3rd operation, as the last element of arr1 is greater than the last element of arr2 (2 > 1), append nums[3] to arr1.
//After 3 operations, arr1 = [2,3] and arr2 = [1].
//Hence, the array result formed by concatenation is [2,3,1].

public class DistributeElementsIntoTwoArraysI implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 4};

        int[] resultArray = resultArray(nums);

        System.out.println(Arrays.toString(resultArray));
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 10% of other solutions.
    private int[] resultArray(int[] nums) {

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        int[] resultArray = new int[nums.length];

        leftList.add(nums[0]);
        rightList.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (leftList.get(leftList.size() - 1) > rightList.get(rightList.size() - 1)) {
                leftList.add(nums[i]);
            } else {
                rightList.add(nums[i]);
            }
        }

        int i = 0;
        for (Integer num : leftList) {
            resultArray[i] = num;
            i++;
        }
        for (Integer num : rightList) {
            resultArray[i] = num;
            i++;
        }

        return resultArray;
    }
}
