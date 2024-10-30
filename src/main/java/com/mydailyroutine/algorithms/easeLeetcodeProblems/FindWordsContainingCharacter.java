package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

//Description:
//You are given a 0-indexed array of strings words and a character x.
//
//Return an array of indices representing the words that contain the character x.
//
//Note that the returned array may be in any order.
//
//
//
//Example 1:
//
//Input: words = ["leet","code"], x = "e"
//Output: [0,1]
//Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

public class FindWordsContainingCharacter implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] words = {"leet", "code"};
        char letter = 'e';

        List<Integer> findedWords = findWordsContaining(words, letter);

        System.out.println(findedWords);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 44% of other solutions.
    private List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indexes.add(i);
            }
        }

        return indexes;
    }
}
