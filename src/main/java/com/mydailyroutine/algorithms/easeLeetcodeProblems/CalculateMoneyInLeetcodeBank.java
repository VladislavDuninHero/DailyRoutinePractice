package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class CalculateMoneyInLeetcodeBank implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int n = 10;

        int total = totalMoney(n);

        System.out.println(total);
    }

    private int totalMoney(int n) {

        int step = 7;
        int count = 1;
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (i == step) {
                count++;
            }

            total += i + count;
        }

        return total;
    }
}
