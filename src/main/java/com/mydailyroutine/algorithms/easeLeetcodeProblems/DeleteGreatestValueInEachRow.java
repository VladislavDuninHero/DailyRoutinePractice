package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

//Description:
//You are given an m x n matrix grid consisting of positive integers.
//
//Perform the following operation until grid becomes empty:
//
//Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
//Add the maximum of deleted elements to the answer.
//Note that the number of columns decreases by one after each operation.
//
//Return the answer after performing the operations described above.
//
//
//
//Example 1:
//
//
//Input: grid = [[1,2,4],[3,3,1]]
//Output: 8
//Explanation: The diagram above shows the removed values in each step.
//- In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
//- In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
//- In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
//The final answer = 4 + 3 + 1 = 8.

public class DeleteGreatestValueInEachRow implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] grid = {{1, 2, 4}, {3, 3, 1}};

        int deleteGreatestValue = deleteGreatestValue(grid);

        System.out.println(deleteGreatestValue);
    }

    //Runtime: beats 6% of other solutions.
    //Memory: beats 11% of other solutions.
    private int deleteGreatestValue(int[][] grid) {

        int sum = 0;
        List<List<Integer>> maxNumbers = new ArrayList<>();
        List<Integer> filterAllMaxNumbers = new ArrayList<>();

        while (true) {

            boolean isHaveUpperZeroNumber = analyzeGrid(grid);

            if (!isHaveUpperZeroNumber) {
                break;
            }

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < grid.length; i++) {
                int max = 0;
                int maxElementInRow = 0;

                for (int j = 0; j < grid[i].length; j++) {
                    if (max < grid[i][j]) {
                        max = grid[i][j];
                        maxElementInRow = j;
                    }
                }

                grid[i][maxElementInRow] = 0;
                numbers.add(max);

                max = 0;
            }

            maxNumbers.add(numbers);
        }

        System.out.println(maxNumbers);

        for (int i = 0; i < maxNumbers.size(); i++) {
            int max = 0;
            for (int j = 0; j < maxNumbers.get(i).size(); j++) {
                if (maxNumbers.get(i).get(j) > max) {
                    max = maxNumbers.get(i).get(j);
                }
            }

            filterAllMaxNumbers.add(max);
        }

        for (Integer number : filterAllMaxNumbers) {
            sum += number;
        }

        return sum;
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
