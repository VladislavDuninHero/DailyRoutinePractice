package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class Fibonacci implements AlgosActionDispatcher {

    @Override
    public void execute() {
        System.out.println(fib(4));
    }

    //recursion example
    private int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

}
