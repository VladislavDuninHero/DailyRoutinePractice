package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


//Description:
//You are playing the following Nim Game with your friend:
//
//Initially, there is a heap of stones on the table.
//You and your friend will alternate taking turns, and you go first.
//On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
//The one who removes the last stone is the winner.
//Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.
//
//
//
//Example 1:
//
//Input: n = 4
//Output: false
//Explanation: These are the possible outcomes:
//1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
//2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
//3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
//In all outcomes, your friend wins.

public class NimGame implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int n = 4;

        boolean isWin = canWinNim(n);
        System.out.println(isWin);
    }

    //Runtime: beats 100% of other solutions runtime.
    //Memory: beats 51% of other solutions memory.
    private boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
