package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

public class FindWordsThatCanBeFormedByCharacters implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        int countOfLength = countCharacters(words, chars);

        System.out.println(countOfLength);
    }

    private int countCharacters(String[] words, String chars) {
        List<String> listOfWords = new ArrayList<String>();



        return 0;
    }
}
