package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

//Description:
//Link: https://leetcode.com/problems/find-the-number-of-winning-players/submissions/1448840353/
//You are given an integer n representing the number of players in a game and a 2D array pick where pick[i] = [xi, yi] represents that the player xi picked a ball of color yi.
//
//Player i wins the game if they pick strictly more than i balls of the same color. In other words,
//
//Player 0 wins if they pick any ball.
//Player 1 wins if they pick at least two balls of the same color.
//...
//Player i wins if they pick at leasti + 1 balls of the same color.
//Return the number of players who win the game.
//
//Note that multiple players can win the game.
//
//
//
//Example 1:
//
//Input: n = 4, pick = [[0,0],[1,0],[1,0],[2,1],[2,1],[2,0]]
//
//Output: 2
//
//Explanation:
//
//Player 0 and player 1 win the game, while players 2 and 3 do not win.

public class FindTheNumberOfWinningPlayers implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[][] pick = {{1, 1}, {2, 4}, {2, 4}, {2, 4}, {2, 5}};
        int n = 4;

        int winningPlayersCount = winningPlayerCount(n, pick);

        System.out.println(winningPlayersCount);
    }

    //Runtime: beats 5% of other solutions.
    //Memory: beats 66% of other solutions.
    //Time complexity: O(n * m).
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> winningPlayersMap = new HashMap<>();

        int winningPlayersCount = 0;

        for (int i = 0; i < n; i++) {
            winningPlayersMap.put(i, new HashMap<>());
        }

        for (int i = 0; i < pick.length; i++) {

            int key = pick[i][0];
            int value = pick[i][1];

            if (winningPlayersMap.get(key).containsKey(value)) {
                winningPlayersMap.get(key).put(value, winningPlayersMap.get(key).get(value) + 1);
                continue;
            }

            winningPlayersMap.get(key).put(value, 1);
        }

        for (Map.Entry<Integer, Map<Integer, Integer>> entry : winningPlayersMap.entrySet()) {
            for (Map.Entry<Integer, Integer> deepEntry : entry.getValue().entrySet()) {
                if (deepEntry.getValue() >= entry.getKey() + 1) {
                    winningPlayersCount++;
                    break;
                }
            }
        }

        return winningPlayersCount;
    }
}
