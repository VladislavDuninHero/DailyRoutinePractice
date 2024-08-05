package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class NumberOfStudentsUnableToEatLunch implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};

        int count = countStudents(students, sandwiches);

        System.out.println(count);
    }

    private int countStudents(int[] students, int[] sandwiches) {
        int studentsCount = students.length;
        int sandwichesCount = sandwiches.length;

        List<Integer> listOfStudents = new ArrayList<>();
        List<Integer> listOfSandwiches = new ArrayList<>();

        for (int i = 0; i < studentsCount; i++) {
            listOfStudents.add(students[i]);
        }

        for (int i = 0; i < sandwichesCount; i++) {
            listOfSandwiches.add(sandwiches[i]);
        }

        for (Integer sandwich : sandwiches) {
            for (Integer student : students) {
                if (Objects.equals(sandwich, student)) {
                    listOfStudents.remove(student);
                    listOfSandwiches.remove(sandwich);
                    break;
                }


            }
        }

        System.out.println(listOfStudents);

        return listOfStudents.size();
    }
}
