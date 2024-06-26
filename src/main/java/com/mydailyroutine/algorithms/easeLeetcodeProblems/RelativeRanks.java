package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks implements AlgosActionDispatcher {

    //Description:
    //ou are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
    //
    //The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
    //
    //The 1st place athlete's rank is "Gold Medal".
    //The 2nd place athlete's rank is "Silver Medal".
    //The 3rd place athlete's rank is "Bronze Medal".
    //For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
    //Return an array answer of size n where answer[i] is the rank of the ith athlete.
    //
    //
    //
    //Example 1:
    //
    //Input: score = [5,4,3,2,1]
    //Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
    //Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
    //Example 2:
    //
    //Input: score = [10,3,8,9,4]
    //Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
    //Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

    @Override
    public void execute() {
        int[] score = {1, 4, 10, 2, 3};

        String array = Arrays.toString(findRelativeRanks(score));

        System.out.println(array);
    }

    private String[] findRelativeRanks(int[] score) {
        String[] scoreResult = new String[score.length];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {

            int index = map.get(score[i]);

            if (i == score.length - 1) {
                scoreResult[index] = "Gold Medal";
            } else if (i == score.length - 2) {
                scoreResult[index] = "Silver Medal";
            } else if (i == score.length - 3) {
                scoreResult[index] = "Bronze Medal";
            }

            if (i < score.length - 3) {
                scoreResult[index] = String.valueOf(score.length - i);
            }
        }

        return scoreResult;

    }
}
