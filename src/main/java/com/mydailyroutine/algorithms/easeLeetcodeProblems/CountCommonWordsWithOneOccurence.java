package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class CountCommonWordsWithOneOccurence implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] arrayOfWordsOne = {"leetcode", "is", "amazing", "as", "is"};
        String[] arrayOfWordsTwo = {"amazing", "leetcode", "is"};

        int countOfWords = countWords(arrayOfWordsOne, arrayOfWordsTwo);

        System.out.println(countOfWords);
    }

    //Runtime: beats 5%.
    //Memory: beats 86%.
    private int countWords(String[] words1, String[] words2) {
        List<String> words = new ArrayList<>();

        for (int i = 0; i < words1.length; i++) {

            boolean isReplicated = false;
            for (int k = 0; k < words1.length; k++) {
                if (words1[i].equals(words1[k]) && i != k) {
                    isReplicated = true;
                    break;
                }
            }
            if (isReplicated) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < words2.length; j++) {
                if (words1[i].equals(words2[j])) {
                    count++;
                }
            }

            if (count == 1) {
                words.add(words1[i]);
            }
        }

        return words.size();
    }

    private int countOfWordsAlternative(String[] words1, String[] words2) {
        List<String> noDuplicateWordsFirst = new ArrayList<>();
        List<String> noDuplicateWordsSecond = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < words1.length; i++) {

            if (!noDuplicateWordsFirst.contains(words1[i])) {
                noDuplicateWordsFirst.add(words1[i]);
            }

            count++;

            if (count == 1) {

            }
        }

        for (int i = 0; i < words2.length; i++) {

        }

        return 0;
    }
}
