package com.mydailyroutine.algorithms.recursion;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class Recursion implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3};
        String text = "Hello world!";
        int[][] deepNums = {{1, 2}, {3, 4}, {5, 6}};

        loopRecursion(nums, 0);
        reverseStringWithRecursion(text.toCharArray(), 0);
    }

    //Question: loop through a two-dimensional array without a loop.
    private void loopRecursion(int[] array, int key) {
        if (key >= array.length) {
            return;
        }

        System.out.println(array[key]);

        loopRecursion(array, ++key);
    }

    private void reverseStringWithRecursion(char[] text, int key) {

        if (key < text.length - 1) {
            reverseStringWithRecursion(text, key + 1);
        }

        System.out.println(text[key]);
    }

}
