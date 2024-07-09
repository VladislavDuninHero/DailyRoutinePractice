package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class CountNegativeNumbersInASortedMatrix implements AlgosActionDispatcher {
    //Description:
    //Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
    //Example 1:
    //
    //Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    //Output: 8
    //Explanation: There are 8 negatives number in the matrix.
    //Example 2:
    //
    //Input: grid = [[3,2],[1,0]]
    //Output: 0

    @Override
    public void execute() {
        int[][] matrix = {{-1, 2, 3, -2}, {1, 0, -1, 1}, {4, 5, -6, -100, 1}};

        int count = countNegatives(matrix);
        System.out.println(count);
    }

    private int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
