package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class BuyTwoChocolates implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] prices = {98, 54, 6, 34, 66, 63, 52, 39};
        int money = 62;

        int chocolates = buyChoco(prices, money);

        System.out.println(chocolates);
    }

    private int buyChoco(int[] prices, int money) {

        int chocolates = 0;
        int baseMoney = money;

        for (int i = 0; i < prices.length; i++) {
            if (chocolates >= 2) {
                return money;
            }

            if (money - prices[i] >= 0) {
                chocolates++;
                money = money - prices[i];
            }
        }

        return baseMoney;
    }
}
