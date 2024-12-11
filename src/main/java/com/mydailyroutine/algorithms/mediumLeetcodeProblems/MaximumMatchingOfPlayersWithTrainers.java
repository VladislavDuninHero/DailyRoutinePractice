package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class MaximumMatchingOfPlayersWithTrainers implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] players = {4, 7, 9};
        int[] trainers = {1};

        int matchingNumber = matchPlayersAndTrainers(players, trainers);

        System.out.println(matchingNumber);
    }

    private int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int matchingNumber = 0;

        int playersLength = players.length - 1;

        int playerPointer = 0;
        int trainerPointer = 0;
        while (playerPointer <= playersLength) {

            if (players[playerPointer] >= 0 && trainers[trainerPointer] >= 0 && players[playerPointer] <= trainers[trainerPointer]) {
                players[playerPointer] = -1;
                trainers[trainerPointer] = -1;
                matchingNumber++;
                trainerPointer = 0;
                playerPointer++;

                if (trainers.length == 1) {
                    break;
                }

                continue;
            }

            if (trainerPointer == trainers.length - 1) {
                trainerPointer = 0;

                if (trainers.length == 1) {
                    break;
                }

                continue;
            }

            trainerPointer++;
        }

        return matchingNumber;
    }
}
