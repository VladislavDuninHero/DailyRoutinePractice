package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

//Description:
//There are n teams numbered from 0 to n - 1 in a tournament.
//
//Given a 0-indexed 2D boolean matrix grid of size n * n. For all i, j that 0 <= i, j <= n - 1 and i != j team i is stronger than team j if grid[i][j] == 1, otherwise, team j is stronger than team i.
//
//Team a will be the champion of the tournament if there is no team b that is stronger than team a.
//
//Return the team that will be the champion of the tournament.
//
//
//
//Example 1:
//
//Input: grid = [[0,1],[0,0]]
//Output: 0
//Explanation: There are two teams in this tournament.
//grid[0][1] == 1 means that team 0 is stronger than team 1. So team 0 will be the champion.

public class FindTheChampion implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] championship = {{0, 1, 1}, {0, 0, 0}, {0, 1, 0}};

        int champion = findChampion(championship);

        System.out.println(champion);
    }

    //Runtime: beats 78% of other solutions runtime.
    //Memory: beats 55% of other solutions memory.
    private int findChampion(int[][] grid) {
        Map<Integer, Integer> teamsPoints = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            teamsPoints.put(i, 0);
            for (int j = 0; j < grid[i].length; j++) {
                teamsPoints.put(i, teamsPoints.get(i) + grid[i][j]);
            }
        }

        int maxPoints = 0;
        int maxPointsChampion = 0;

        for (Map.Entry<Integer, Integer> entry : teamsPoints.entrySet()) {
            if (maxPoints < entry.getValue()) {
                maxPoints = entry.getValue();
                maxPointsChampion = entry.getKey();
            }
        }

        return maxPointsChampion;
    }
}
