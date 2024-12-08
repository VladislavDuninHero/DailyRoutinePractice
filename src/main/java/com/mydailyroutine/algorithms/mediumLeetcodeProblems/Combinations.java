package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

//Link: https://leetcode.com/problems/combinations/
//Description:
//Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
//
//You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//Explanation: There are 4 choose 2 = 6 total combinations.
//Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

public class Combinations implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int n = 4;
        int k = 2;

        List<List<Integer>> combinations = combine(n, k);

        System.out.println(combinations);
    }

    //Runtime: beats 81% of other solutions runtime.
    //Memory: beats 88% of other solutions runtime.
    //Time complexity: O(k * C(n, k)).
    private List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backTrack(combinations, combination, 1, n, k);

        return combinations;
    }

    private void backTrack(
            List<List<Integer>> combinations,
            List<Integer> combination,
            int start,
            int n,
            int k
    ) {
        if (combination.size() == k) {
            combinations.add(new ArrayList<>(combination));

            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);

            backTrack(combinations, combination, i + 1, n, k);

            combination.remove(combination.size() - 1);
        }

    }

}
