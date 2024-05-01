package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class ShuffleTheArray implements AlgosActionDispatcher {

    //Description:
    //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    @Override
    public void execute() {
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];

        int left = 0;
        int right = n;
        int counter = 0;

        while (right != nums.length) {
            newArr[counter] = nums[left];
            newArr[counter + 1] = nums[right];
            left++;
            right++;
            counter = counter + 2;
         }

        return newArr;
    }
}
