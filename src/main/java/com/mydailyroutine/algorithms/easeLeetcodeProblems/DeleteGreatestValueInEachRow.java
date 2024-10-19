package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

public class DeleteGreatestValueInEachRow implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] grid = {{1, 2, 3}, {3, 3, 1}};

        int deleteGreatestValue = deleteGreatestValue(grid);

        System.out.println(deleteGreatestValue);
    }

    private int deleteGreatestValue(int[][] grid) {

        List<Integer> maxNumbers = new ArrayList<>();

        boolean isDeleted = false;
        while (true) {

            boolean isHaveUpperZeroNumber = analyzeGrid(grid);

            if (!isHaveUpperZeroNumber) {
                break;
            }

            for (int i = 0; i < grid.length; i++) {
                int max = 0;

                for (int j = 0; j < grid[i].length; j++) {
                    if (max < grid[i][j]) {
                        max = grid[i][j];
                    }

                    grid[i][j] = 0;
                }

                maxNumbers.add(max);
                max = 0;
            }


        }

        System.out.println(maxNumbers);

        return 0;
    }

    private boolean analyzeGrid(int[][] grid) {
        boolean isNumberUpperZero = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    isNumberUpperZero = true;
                    break;
                }
            }

            if (isNumberUpperZero) {
                break;
            }
        }

        return isNumberUpperZero;
    }
}
