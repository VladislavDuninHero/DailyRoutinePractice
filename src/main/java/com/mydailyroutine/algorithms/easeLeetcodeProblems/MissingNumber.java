package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Description:
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

public class MissingNumber implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int missingNumber = missingNumber(nums);

        System.out.println(missingNumber);
    }

    //Runtime: beats 5% of other solutions.
    //Memory: beats 58% of other solutions.
    private int missingNumber(int[] numbers) {
        List<Integer> buffer = new ArrayList<>(3);
        List<Integer> secondBuffer = new ArrayList<>();
        int missingNum = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            buffer.add(numbers[i]);

            if (i == numbers.length - 1) {
                buffer.add(0);
            }
        }

        for (int i = 0; i < numbers.length + 1; i++) {
            secondBuffer.add(i);
        }

        for (int i = 0; i < buffer.size(); i++) {
            if (!buffer.get(i).equals(secondBuffer.get(i))) {
                missingNum = secondBuffer.get(i);
                break;
            }
        }

        return missingNum;
    }
}
