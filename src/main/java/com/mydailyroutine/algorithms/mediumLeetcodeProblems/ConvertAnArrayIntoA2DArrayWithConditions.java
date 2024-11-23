package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] array = {1, 3, 4, 1, 2, 3, 1};

        List<List<Integer>> matrix = findMatrix(array);

        System.out.println(matrix);
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        return null;
    }
}
