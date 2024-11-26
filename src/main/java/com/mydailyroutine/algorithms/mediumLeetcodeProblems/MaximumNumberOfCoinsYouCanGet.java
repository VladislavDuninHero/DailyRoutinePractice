package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Link: https://leetcode.com/problems/maximum-number-of-coins-you-can-get/submissions/1463514723/
//Description:
//There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
//
//In each step, you will choose any 3 piles of coins (not necessarily consecutive).
//Of your choice, Alice will pick the pile with the maximum number of coins.
//You will pick the next pile with the maximum number of coins.
//Your friend Bob will pick the last pile.
//Repeat until there are no more piles of coins.
//Given an array of integers piles where piles[i] is the number of coins in the ith pile.
//
//Return the maximum number of coins that you can have.
//
//
//
//Example 1:
//
//Input: piles = [2,4,1,2,7,8]
//Output: 9
//Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
//Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
//The maximum number of coins which you can have are: 7 + 2 = 9.
//On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.

public class MaximumNumberOfCoinsYouCanGet implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] piles = {2, 4, 1, 2, 7, 8};

        int maxCoins = maxCoinsWithTwoPointers(piles);

        System.out.println(maxCoins);
    }

    //Runtime: beats 7% of other solutions.
    //Memory: beats 5% of other solutions.
    //Time complexity: O(n log n)
    private int maxCoinsWithTwoPointers(int[] piles) {

        Arrays.sort(piles);

        if (piles.length == 3) {
            return piles[1];
        }

        int sum = 0;

        List<List<Integer>> triplets = new ArrayList<>();

        int head = 0;
        int tail = piles.length - 1;

        while (head < tail) {
            List<Integer> list = new ArrayList<>();

            list.add(piles[tail]);
            list.add(piles[tail - 1]);

            tail -= 2;

            list.add(piles[head]);
            head++;

            triplets.add(list);
        }

        for (int i = 0; i < triplets.size(); i++) {
            sum += triplets.get(i).get(1);
        }

        return sum;
    }
}
