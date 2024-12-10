package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.LinkedList;
import java.util.Queue;

//Link: https://leetcode.com/problems/jump-game-iii/
//Description:
//Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
//
//Notice that you can not jump outside of the array at any time.
//
//
//
//Example 1:
//
//Input: arr = [4,2,3,0,3,1,2], start = 5
//Output: true
//Explanation:
//All possible ways to reach at index 3 with value 0 are:
//index 5 -> index 4 -> index 1 -> index 3
//index 5 -> index 6 -> index 4 -> index 1 -> index 3

public class JumpGameIII implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] array = {3, 0, 2, 1, 2};
        int start = 2;

        boolean canReach = canReach(array, start);

        System.out.println(canReach);
    }

    //Runtime: beats 39% of other solutions.
    //Memory: beats 62% of other solutions.
    //Time complexity: O(n).
    private boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }

        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentIndex = queue.poll();
            visited[currentIndex] = true;

            int left = currentIndex - arr[currentIndex];
            int right = currentIndex + arr[currentIndex];

            if (left >= 0 && left < arr.length && !visited[left]) {
                if (arr[left] == 0) return true;
                queue.add(left);
            }

            if (right >= 0 && right < arr.length && !visited[right]) {
                if (arr[right] == 0) return true;
                queue.add(right);
            }
        }

        return false;
    }

}
