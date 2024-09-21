package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class RotateString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }

    private boolean rotateString(String s, String goal) {

        String[] splitString = goal.split("");

        for (int i = 0; i < splitString.length; i++) {

            String temp = splitString[0];
            String lastTemp = splitString[splitString.length - i - 1];
            splitString[0] = null;

            for (int j = 0; j < splitString.length - 1; j++) {
                splitString[j] = splitString[j + 1];
            }

            splitString[splitString.length - i - 1] = temp;
            splitString[splitString.length - i - 2] = lastTemp;

        }

        return false;
    }
}
