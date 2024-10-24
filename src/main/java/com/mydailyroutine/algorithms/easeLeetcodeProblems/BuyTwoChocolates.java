package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
//
//You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
//
//Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
//
//
//
//Example 1:
//
//Input: prices = [1,2,2], money = 3
//Output: 0
//Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.

public class BuyTwoChocolates implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] prices = {25, 24};
        int money = 92;

        int chocolates = buyChoco(prices, money);

        System.out.println(chocolates);
    }

    //Runtime: beats 71% of other solutions.
    //Memory: beats 29% of other solutions.
    private int buyChoco(int[] prices, int money) {

        int chocolates = 0;
        int baseMoney = money;

        Arrays.sort(prices);

        for (int i = 0; i <= prices.length - 1; i++) {
            if (chocolates >= 2) {
                return money;
            }

            if (money - prices[i] >= 0) {
                chocolates++;
                money = money - prices[i];
            }
        }

        if (chocolates < 2) {
            return baseMoney;
        }

        return money;
    }
}
