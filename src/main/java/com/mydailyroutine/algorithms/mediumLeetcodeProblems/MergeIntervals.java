package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Link: https://leetcode.com/problems/merge-intervals/
//Description:
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
//
//
//Example 1:
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

public class MergeIntervals implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] intervals = {{1, 4}, {2, 3}};

        int[][] mered = merge(intervals);

        System.out.println(Arrays.deepToString(mered));
    }

    //Runtime: beats 88% of other solutions.
    //Memory: beats 19% of other solutions.
    //Time complexity: O(n log n)
    private int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int k = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[k][1] >= intervals[i][0]) {
                intervals[k][1] = Math.max(intervals[k][1], intervals[i][1]);
            } else {
                k++;
                intervals[k] = intervals[i];
            }
        }

        return Arrays.copyOfRange(intervals, 0, k + 1);
    }
}
