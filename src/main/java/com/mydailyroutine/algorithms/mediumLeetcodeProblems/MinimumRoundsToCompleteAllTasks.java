package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

//Link: https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
//Description:
//You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
//
//Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
//
//
//
//Example 1:
//
//Input: tasks = [2,2,3,3,2,4,4,4,4,4]
//Output: 4
//Explanation: To complete all the tasks, a possible plan is:
//- In the first round, you complete 3 tasks of difficulty level 2.
//- In the second round, you complete 2 tasks of difficulty level 3.
//- In the third round, you complete 3 tasks of difficulty level 4.
//- In the fourth round, you complete 2 tasks of difficulty level 4.
//It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.

public class MinimumRoundsToCompleteAllTasks implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] tasks = {7, 7, 7, 7, 7, 7};

        int minimumRoundsToComplete = minimumRounds(tasks);

        System.out.println(minimumRoundsToComplete);
    }

    //Runtime: beats 5% of other solutions.
    //Memory: beats 11% of other solutions.
    //Time complexity: O(n).
    private int minimumRounds(int[] tasks) {

        int minimumRounds = 0;
        int invalidValue = 1;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < tasks.length; i++) {
            counts.put(tasks[i], counts.getOrDefault(tasks[i], 0) + 1);
        }

        for (int count : counts.values()) {
            if (count <= invalidValue) {
                return -1;
            }

            if (count > 3) {
                for (int i = 0; i < count; i += 3) {
                    minimumRounds++;
                }
                continue;
            }

            minimumRounds++;
        }

        return minimumRounds;
    }

}
