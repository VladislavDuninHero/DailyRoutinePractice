package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        int countOfConsistentStrings = countConsistentStrings(allowed, words);

        System.out.println(countOfConsistentStrings);
    }

    private int countConsistentStrings(String allowed, String[] words) {

        int count = 0;



        return count;
    }
}
