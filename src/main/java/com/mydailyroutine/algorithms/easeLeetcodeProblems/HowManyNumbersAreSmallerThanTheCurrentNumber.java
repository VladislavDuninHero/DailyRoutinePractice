package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {6, 5, 4, 8};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    private int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallers = new int[nums.length];

        int head = 0;
        int tail = nums.length - 1;
        int count = 0;

        while (head < nums.length) {
            if (head == nums.length) {
                break;
            }

            if (tail < 0) {
                tail = nums.length - 1;
                smallers[head] = count;
                head++;
                count = 0;
                continue;
            }

            if (nums[tail] < nums[head] && nums[tail] != nums[head]) {
                count++;
            }

            tail--;
        }

        return smallers;
    }
}
