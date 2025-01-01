package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Link: https://leetcode.com/problems/sort-the-students-by-their-kth-score/
//Description:
//There is a class with m students and n exams. You are given a 0-indexed m x n integer matrix score, where each row represents one student and score[i][j] denotes the score the ith student got in the jth exam. The matrix score contains distinct integers only.
//
//You are also given an integer k. Sort the students (i.e., the rows of the matrix) by their scores in the kth (0-indexed) exam from the highest to the lowest.
//
//Return the matrix after sorting it.
//
//
//
//Example 1:
//
//
//Input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
//Output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
//Explanation: In the above diagram, S denotes the student, while E denotes the exam.
//- The student with index 1 scored 11 in exam 2, which is the highest score, so they got first place.
//- The student with index 0 scored 9 in exam 2, which is the second highest score, so they got second place.
//- The student with index 2 scored 3 in exam 2, which is the lowest score, so they got third place.

public class SortTheStudentsByTheirKthScore implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] words = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;

        int[][] sortedStudents = sortTheStudents(words, k);
        int[][] sortedStudentsAlternative = sortTheStudentsAlternative(words, k);
        System.out.println(Arrays.deepToString(sortedStudents));
        System.out.println(Arrays.deepToString(sortedStudentsAlternative));
    }

    //Runtime: beats 32% of other solutions.
    //Memory: beats 33% of other solutions.
    //Time complexity: O(n^2).
    private int[][] sortTheStudents(int[][] score, int k) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i <= score.length - 1; i++) {
                if (score[i - 1][k] < score[i][k]) {
                    isSorted = false;

                    int[] temp = score[i - 1];
                    score[i - 1] = score[i];
                    score[i] = temp;
                }
            }
        }

        return score;
    }

    private int[][] sortTheStudentsAlternative(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));

        return score;
    }
}
