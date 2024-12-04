package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Link: https://leetcode.com/problems/maximum-ice-cream-bars/description/
//Description:
//It is a sweltering summer day, and a boy wants to buy some ice cream bars.
//
//At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.
//
//Note: The boy can buy the ice cream bars in any order.
//
//Return the maximum number of ice cream bars the boy can buy with coins coins.
//
//You must solve the problem by counting sort.
//
//
//
//Example 1:
//
//Input: costs = [1,3,2,4,1], coins = 7
//Output: 4
//Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

public class MaximumIceCreamBars implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;

        int maximumIceCream = maxIceCream(costs, coins);

        System.out.println(maximumIceCream);
    }

    //Runtime: beats 74% of other solutions.
    //Memory: beats 6% of other solutions.
    //Time complexity: O(n + k).
    private int maxIceCream(int[] costs, int coins) {

        countingSort(costs);

        int countIceCream = 0;

        for (int i = 0; i < costs.length; i++) {
            coins = coins - costs[i];

            if (coins >= 0) {
                countIceCream++;
                continue;
            }

            break;
        }

        return countIceCream;
    }

    private void countingSort(int[] costs) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > max) {
                max = costs[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] < min) {
                min = costs[i];
            }
        }

        int range = max - min + 1;

        int[] count = new int[range];

        for (int num : costs) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                costs[index++] = i + min;
                count[i]--;
            }
        }

    }

}
