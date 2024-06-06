package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastStoneWeight implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones));
    }

    private int lastStoneWeight(int[] stones) {
        int[] pair = {0, 0};
        List<Integer> newStones = new ArrayList<>();

        Arrays.sort(stones);

        int head = 0;
        int tail = stones.length - 1;

        while (head < stones.length - 1) {
            if (tail < 0) {
                head++;
                tail = stones.length - 1;
            }

            if (tail > 2) {
                pair[0] = stones[tail];
                pair[1] = stones[tail - 1];
            }


            if (pair[0] != pair[1]) {
                newStones.add(pair[0] - pair[1]);
            }




            System.out.println(Arrays.toString(pair));
            System.out.println(Arrays.toString(stones));

            tail -= 2;
        }


        System.out.println(newStones);

        return 0;
    }
}
