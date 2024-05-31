package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class Fibonacci implements AlgosActionDispatcher {

    @Override
    public void execute() {
        System.out.println(fib(4));
        System.out.println(fibIteration(4));
    }

    //recursion example
    private int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private int fibIteration(int n) {
        int prev = 0;
        int next = 1;
        int result = 0;

        if (n <= 1) {
            return n;
        }

        for (int i = 2; i <= n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }

        return result;
    }

}
