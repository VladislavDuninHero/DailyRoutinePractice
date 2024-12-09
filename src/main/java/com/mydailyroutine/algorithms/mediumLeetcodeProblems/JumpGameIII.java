package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] array = {4, 2, 3, 0, 3, 1, 2};
        int start = 5;

        boolean canReach = canReach(array, start);

        System.out.println(canReach);
    }

    private boolean canReach(int[] arr, int start) {
        while (true) {

            start += arr[start];
            boolean reach = false;
            if (start > arr.length - 1) {
                reach = true;
                start -= arr[start];
            }
            if (arr[start] == 0) {
                return true;
            }
            int leftState = arr[start];


            if (!reach) {
                start -= arr[start];
            }
            if (arr[start] == 0) {
                return true;
            }
            int rightState = arr[start];

            if (leftState == rightState) {
                return false;
            }

            reach = false;
        }

    }

}
