package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class HeightChecker implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] heights = {1, 1, 4, 2, 1, 3};

        System.out.println(heightChecker(heights));
    }

    private int heightChecker(int[] heights) {
        int[] expectedArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expectedArray);

        int head = 0;
        int counter = 0;

        while (head != heights.length) {
            if (heights[head] != expectedArray[head]) {
                counter++;
            }

            head++;
        }

        return counter;
    }
}
