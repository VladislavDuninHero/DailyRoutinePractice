package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

//Description:
//Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
//
//He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
//Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
//
//
//
//Example 1:
//
//Input: n = 4
//Output: 10
//Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

//Example 2:
//
//Input: n = 10
//Output: 37
//Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

public class CalculateMoneyInLeetcodeBank implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int n = 20;

        int total = totalMoney(n);

        System.out.println(total);
    }

    private int totalMoney(int n) {

        int step = 7;
        int count = 1;
        int total = 1;
        int currentDay = 1;
        int money = 0;
        int loopCounter = 1;

        List<Integer> week = new ArrayList<>();

        while (count <= n) {
            week.add(currentDay);

            if (loopCounter == step) {
                total = total + 1;
                currentDay = total;
                count++;
                loopCounter = 1;
                continue;
            }


            count++;
            currentDay++;
            loopCounter++;
        }

        for (Integer moneyInDay : week) {
            money += moneyInDay;
        }

        return money;
    }
}
