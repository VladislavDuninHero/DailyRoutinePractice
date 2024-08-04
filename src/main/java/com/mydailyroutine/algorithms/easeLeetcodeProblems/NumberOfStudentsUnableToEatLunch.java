package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class NumberOfStudentsUnableToEatLunch implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};

        int count = countStudents(students, sandwiches);

        System.out.println(count);
    }

    private int countStudents(int[] students, int[] sandwiches) {

        return 0;
    }
}
