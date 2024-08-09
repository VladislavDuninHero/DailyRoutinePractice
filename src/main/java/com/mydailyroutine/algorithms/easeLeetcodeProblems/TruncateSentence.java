package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
//
//For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
//You are given a sentence sand an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.
//
//
//
//Example 1:
//
//Input: s = "Hello how are you Contestant", k = 4
//Output: "Hello how are you"
//Explanation:
//The words in s are ["Hello", "how" "are", "you", "Contestant"].
//The first 4 words are ["Hello", "how", "are", "you"].
//Hence, you should return "Hello how are you".

public class TruncateSentence implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String sentence = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(sentence, k));
    }

    //Beat 75% of other submission's runtime
    private String truncateSentence(String s, int k) {
        if (s.isBlank() || s.isEmpty()) {
            throw new IllegalArgumentException("Sentence is empty");
        }

        if (k > s.length()) {
            k = s.length();
        }

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            if (n == k) {
                break;
            }

            if (chars[i] == ' ') {
                n++;
            }

            stringBuilder.append(chars[i]);
        }

        return stringBuilder.toString().trim();
    }
}

