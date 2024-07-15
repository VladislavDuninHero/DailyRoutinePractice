package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder implements AlgosActionDispatcher {

    //Description:
    //Given two arrays of integers nums and index. Your task is to create target array under the following rules:
    //
    //Initially target array is empty.
    //From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    //Repeat the previous step until there are no elements to read in nums and index.
    //Return the target array.
    //
    //It is guaranteed that the insertion operations will be valid.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    //Output: [0,4,1,3,2]
    //Explanation:
    //nums       index     target
    //0            0        [0]
    //1            1        [0,1]
    //2            2        [0,1,2]
    //3            2        [0,1,3,2]
    //4            1        [0,4,1,3,2]

    public void execute() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] indexes = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, indexes)));
    }

    private int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = index[i];
            target.add(currentIndex, nums[i]);
        }

        int[] targetArray = new int[target.size()];

        for (int i = 0; i < target.size(); i++) {
            targetArray[i] = target.get(i);
        }

        return targetArray;
    }

}

