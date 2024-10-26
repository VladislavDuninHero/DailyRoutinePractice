package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//You are given a 0-indexed array words consisting of distinct strings.
//
//The string words[i] can be paired with the string words[j] if:
//
//The string words[i] is equal to the reversed string of words[j].
//0 <= i < j < words.length.
//Return the maximum number of pairs that can be formed from the array words.
//
//Note that each string can belong in at most one pair.
//
//
//
//Example 1:
//
//Input: words = ["cd","ac","dc","ca","zz"]
//Output: 2
//Explanation: In this example, we can form 2 pair of strings in the following way:
//- We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
//- We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
//It can be proven that 2 is the maximum number of pairs that can be formed.

public class FindMaximumNumberOfStringPairs implements AlgosActionDispatcher {

    @Override
    public void execute() {

        String[] words = {"cd", "ac", "dc", "ca", "zz"};

        int pairs = maximumNumberOfStringPairs(words);

        System.out.println(pairs);
    }

    //Runtime: beats 11% of other solutions.
    //Memory: beats 30% of other solutions.
    private int maximumNumberOfStringPairs(String[] words) {
        int countOfPairs = 0;

        for (int i = 0; i < words.length; i++) {
            String[] splitWord = words[i].split("");
            Arrays.sort(splitWord);
            String joinFirstWord = String.join("", splitWord);

            for (int j = i; j < words.length; j++) {
                String[] splitSecondWord = words[j].split("");
                Arrays.sort(splitSecondWord);
                String joinSecondWord = String.join("", splitSecondWord);


                if (i != j && joinFirstWord.equals(joinSecondWord)) {
                    countOfPairs++;
                }
            }
        }

        return countOfPairs;
    }
}
