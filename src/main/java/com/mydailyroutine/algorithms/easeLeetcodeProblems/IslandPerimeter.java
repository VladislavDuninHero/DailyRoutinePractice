package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class IslandPerimeter implements AlgosActionDispatcher {

    //Description:
    //You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
    //
    //Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
    //
    //The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

    //Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
    //Output: 16
    //Explanation: The perimeter is the 16 yellow stripes in the image above.

    @Override
    public void execute() {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        System.out.println(islandPerimeter(grid));
    }

    //Beats 98% of users submissions.
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        if (grid.length == 1 && grid[0].length == 1 && grid[0][0] == 1) {
            return 4;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {

                    if (j - 1 == -1) {
                        perimeter += 1;
                    }

                    if (i - 1 == -1) {
                        perimeter += 1;
                    }

                    if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                        perimeter += 1;
                    }

                    if (j + 1 > grid[i].length - 1) {
                        perimeter += 1;
                    }


                    if (i + 1 >= grid.length) {
                        perimeter += 1;
                    }

                    if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                        perimeter += 1;
                    }

                    if (j - 1 != -1 && grid[i][j - 1] == 0) {
                        perimeter += 1;
                    }

                    if (j + 1 < grid[i].length && grid[i][j + 1] == 0) {
                        perimeter += 1;
                    }


                }
            }

        }

        return perimeter;
    }
}
