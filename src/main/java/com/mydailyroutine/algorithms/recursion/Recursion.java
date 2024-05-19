package com.mydailyroutine.algorithms.recursion;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class Recursion implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3};

        loopRecursion(nums, 0);
    }

    //Question: loop through a two-dimensional array without a loop.
    private void loopRecursion(int[] array, int key) {
        if (key >= array.length) {
            return;
        }

        System.out.println(array[key]);

        loopRecursion(array, ++key);
    }


}
