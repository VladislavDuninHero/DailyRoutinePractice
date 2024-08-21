package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
//
//You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
//
//Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
//
//Return the time taken for the person at position k (0-indexed) to finish buying tickets.
//
//
//
//Example 1:
//
//Input: tickets = [2,3,2], k = 2
//Output: 6
//Explanation:
//- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
//- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
//The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.

public class TimeNeededToBuyTickets implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] tickets = {84, 49, 5, 24, 70, 77, 87, 8};
        int k = 3;

        int resultTime = timeRequiredToBuy(tickets, k);

        System.out.println(resultTime);
    }

    //Runtime: beats 57%
    //Memory: beats 31%
    private int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        int currentUserTickets = tickets[k];


        while (currentUserTickets != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (currentUserTickets == 0) {
                    break;
                }

                if (tickets[i] != 0) {
                    tickets[i] = tickets[i] - 1;
                    time++;

                    if (i == k) {
                        currentUserTickets--;
                    }
                }
            }


        }

        return time;
    }
}
