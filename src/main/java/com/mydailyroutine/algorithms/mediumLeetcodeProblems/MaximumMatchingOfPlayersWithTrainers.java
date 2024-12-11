package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Link: https://leetcode.com/problems/maximum-matching-of-players-with-trainers/
//Description:
//You are given a 0-indexed integer array players, where players[i] represents the ability of the ith player. You are also given a 0-indexed integer array trainers, where trainers[j] represents the training capacity of the jth trainer.
//
//The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be matched with at most one player.
//
//Return the maximum number of matchings between players and trainers that satisfy these conditions.
//
//
//
//Example 1:
//
//Input: players = [4,7,9], trainers = [8,2,5,8]
//Output: 2
//Explanation:
//One of the ways we can form two matchings is as follows:
//- players[0] can be matched with trainers[0] since 4 <= 8.
//- players[1] can be matched with trainers[3] since 7 <= 8.
//It can be proven that 2 is the maximum number of matchings that can be formed.

public class MaximumMatchingOfPlayersWithTrainers implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5, 8};

        int matchingNumber = matchPlayersAndTrainers(players, trainers);

        System.out.println(matchingNumber);
    }

    //Runtime: beats 98% of other solutions.
    //Memory: beats 16% of other solutions.
    //Time complexity: O(n log n) + O(m log m).
    private int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int matchingNumber = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int playersPointer = 0;
        int trainersPointer = 0;
        while (playersPointer <= players.length - 1  && trainersPointer < trainers.length) {
            if (players[playersPointer] <= trainers[trainersPointer]) {
                playersPointer++;
                matchingNumber++;
                trainersPointer++;
            } else {
                trainersPointer++;
            }
        }

        return matchingNumber;
    }

}
