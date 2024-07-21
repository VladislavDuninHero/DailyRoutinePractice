package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] candies = {7, 2, 5, 6, 9, 9, 4, 5};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> kidsWithGreatestCandies = new ArrayList<>();

        int maxOfCandies = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maxOfCandies) {
                maxOfCandies = candies[i];
            }
        }

        int max = maxOfCandies;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {

                kidsWithGreatestCandies.add(Boolean.TRUE);

                continue;
            }

            kidsWithGreatestCandies.add(Boolean.FALSE);
        }

        return kidsWithGreatestCandies;
    }
}
