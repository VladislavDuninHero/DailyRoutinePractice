package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [11,7,2,15]
//Output: 2
//Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
//Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
//In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.

public class CountElementsWithStrictlySmallerAndGreaterElements implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {-3, 3, 3, 90};

        int countOfElementsWithGreaterAndSmallerNums = countElements(nums);
        int countAlt = countOfElementsAlternative(nums);

        System.out.println(countOfElementsWithGreaterAndSmallerNums);
        System.out.println(countAlt);
    }

    //Runtime: beats 12%
    //Memory: beats 99%
    private int countElements(int[] nums) {
        int minAndMaxPairCount = 0;

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    right = 1;
                }

                if (nums[j] < nums[i]) {
                    left = 1;
                }
            }

            if (right > 0 && left > 0) {
                minAndMaxPairCount++;
            }
        }

        return minAndMaxPairCount;
    }

    //Runtime: beats 100%.
    //Memory: beats 74%.
    private int countOfElementsAlternative(int[] nums) {

        int minStrictValue = Integer.MAX_VALUE;
        int maxStrictValue = Integer.MIN_VALUE;

        int numsWithMinAndMaxValue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxStrictValue) {
                maxStrictValue = nums[i];
            }

            if (nums[i] < minStrictValue) {
                minStrictValue = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != minStrictValue && nums[i] != maxStrictValue) {
                numsWithMinAndMaxValue++;
            }
        }

        return numsWithMinAndMaxValue;
    }
}
