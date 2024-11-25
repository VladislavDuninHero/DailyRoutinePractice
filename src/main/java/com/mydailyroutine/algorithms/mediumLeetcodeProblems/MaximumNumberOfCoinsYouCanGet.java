package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class MaximumNumberOfCoinsYouCanGet implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] piles = {2, 4, 1, 2, 7, 8};

        int maxCoins = maxCoins(piles);

        System.out.println(maxCoins);
    }

    private int maxCoins(int[] piles) {
        return 0;
    }
}
