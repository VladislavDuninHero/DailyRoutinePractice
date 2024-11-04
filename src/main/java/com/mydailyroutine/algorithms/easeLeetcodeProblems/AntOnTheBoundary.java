package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class AntOnTheBoundary implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {2, 3, -5};

        int boundaryCount = returnToBoundaryCount(nums);

        System.out.println(boundaryCount);
    }

    private int returnToBoundaryCount(int[] nums) {

        int boundaryCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                int stepIndex = i + nums[i] + 1;

                if (stepIndex > nums.length) {
                    while (stepIndex > nums.length) {

                    }
                }

                if (nums[stepIndex + 1] > nums.length || nums[stepIndex - 1] < 0) {
                    boundaryCount++;
                }

                System.out.println(stepIndex);
            }

            if (nums[i] < 0) {
                int stepIndex = i - nums[i];

                if (nums[stepIndex - 1] < nums.length || nums[stepIndex + 1] > 0) {
                    boundaryCount++;
                }

                System.out.println(stepIndex);
            }
        }

        return 0;
    }
}
