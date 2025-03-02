package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class CustomSortString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String order = "cba";
        String s = "abcd";

        String customString = customSortString(order, s);

        System.out.println(customString);
    }

    private String customSortString(String order, String s) {
        return null;
    }
}
