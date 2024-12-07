package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Link: https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/
//Description:
//You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
//
//Return a list answer of size 2 where:
//
//answer[0] is a list of all players that have not lost any matches.
//answer[1] is a list of all players that have lost exactly one match.
//The values in the two lists should be returned in increasing order.
//
//Note:
//
//You should only consider the players that have played at least one match.
//The testcases will be generated such that no two matches will have the same outcome.
//
//
//Example 1:
//
//Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
//Output: [[1,2,10],[4,5,7,8]]
//Explanation:
//Players 1, 2, and 10 have not lost any matches.
//Players 4, 5, 7, and 8 each have lost one match.
//Players 3, 6, and 9 each have lost two matches.
//Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].

public class FindPlayersWithZeroOrOneLosses implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};

        List<List<Integer>> winners = findWinners(matches);

        System.out.println(winners);
    }

    //Runtime: beats 9% of other solutions.
    //Memory: beats 11% of other solutions.
    //Time complexity: O(n + m)
    private List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> winners = new ArrayList<>();

        SortedSet<Integer> onlyWinners = new TreeSet<>();
        SortedSet<Integer> withOneLoss = new TreeSet<>();

        Map<Integer, Integer> statistic = new HashMap<>();
        Map<Integer, Integer> lossStatistic = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            if (!statistic.containsKey(matches[i][0])) {
                statistic.put(matches[i][0], 0);
            }
        }

        for (int i = 0; i < matches.length; i++) {
            if (statistic.containsKey(matches[i][1])) {
                statistic.put(matches[i][1], statistic.get(matches[i][1]) + 1);
            }
        }

        for (int i = 0; i < matches.length; i++) {
            if (!lossStatistic.containsKey(matches[i][1])) {
                lossStatistic.put(matches[i][1], 0);
            }
        }

        for (int i = 0; i < matches.length; i++) {
            if (lossStatistic.containsKey(matches[i][1])) {
                lossStatistic.put(matches[i][1], lossStatistic.get(matches[i][1]) + 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : statistic.entrySet()) {
            if (entry.getValue() == 0) {
                onlyWinners.add(entry.getKey());
                continue;
            }

            if (entry.getValue() == 1) {
                withOneLoss.add(entry.getKey());
            }
        }

        for (Map.Entry<Integer, Integer> entry : lossStatistic.entrySet()) {
            if (entry.getValue() == 1) {
                withOneLoss.add(entry.getKey());
            }
        }


        winners.add(new ArrayList<>(onlyWinners));
        winners.add(new ArrayList<>(withOneLoss));

        return winners;
    }

}
