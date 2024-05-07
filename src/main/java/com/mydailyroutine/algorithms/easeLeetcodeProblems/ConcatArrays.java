package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class ConcatArrays implements AlgosActionDispatcher {

    //Concatenation of Array.
    //Input: nums = [1,2,1]
    //Output: [1,2,1,1,2,1]
    //Explanation: The array ans is formed as follows:
    //- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    //- ans = [1,2,1,1,2,1]

    @Override
    public void execute() {
        int[] array = {1, 2, 3};

        int[] result = getConcatenation(array);
        System.out.println(Arrays.toString(result));
    }

    private int[] getConcatenation(int[] nums) {

        int newArrayLength = nums.length * 2;
        int[] newArr = new int[newArrayLength];

        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }

        for (int i = nums.length, j = 0; i < newArrayLength; i++, j++) {
            newArr[i] = nums[j];
        }

        return newArr;
    }
}
