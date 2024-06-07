package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class LastStoneWeight implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones));
    }

    private int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        int lastWeight = 0;


        for (int i = stones.length - 1; i > 0; i-- ) {
            Arrays.sort(stones);

            if (stones[stones.length - 1] == stones[stones.length - 2]) {
                stones[stones.length - 1] = 0;
                stones[stones.length - 2] = 0;
                continue;
            }

            int temp = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 1] = 0;
            stones[stones.length - 2] = temp;

        }

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] != 0) {
                lastWeight = stones[i];
            }
        }

        return lastWeight;
    }
}
