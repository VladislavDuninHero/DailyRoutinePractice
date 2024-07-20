package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray implements AlgosActionDispatcher {

    //Description:
    //Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.
    //
    //A substring is a contiguous sequence of characters within a string

    //Example 1:
    //
    //Input: words = ["mass","as","hero","superhero"]
    //Output: ["as","hero"]
    //Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    //["hero","as"] is also a valid answer.

    @Override
    public void execute() {
        String[] words = {"ga", "ugao", "dbh", "a"};

        System.out.println(stringMatching(words));
    }

    private List<String> stringMatching(String[] words) {
        List<String> substringsList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j >= 0; j--) {
                if (
                        words[i].contains(words[j])
                                && !words[i].equals(words[j])
                                && !substringsList.contains(words[j])
                ) {
                    substringsList.add(words[j]);
                }
            }
        }

        return substringsList;
    }
}
