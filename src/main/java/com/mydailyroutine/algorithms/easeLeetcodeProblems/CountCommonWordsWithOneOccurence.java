package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Description:
//Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
//
//
//
//Example 1:
//
//Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
//Output: 2
//Explanation:
//- "leetcode" appears exactly once in each of the two arrays. We count this string.
//- "amazing" appears exactly once in each of the two arrays. We count this string.
//- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
//- "as" appears once in words1, but does not appear in words2. We do not count this string.
//Thus, there are 2 strings that appear exactly once in each of the two arrays.
//Example 2:
//
//Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
//Output: 0
//Explanation: There are no strings that appear in each of the two arrays.
//Example 3:
//
//Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
//Output: 1
//Explanation: The only string that appears exactly once in each of the two arrays is "ab".

public class CountCommonWordsWithOneOccurence implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] arrayOfWordsOne = {"leetcode", "is", "amazing", "as", "is"};
        String[] arrayOfWordsTwo = {"amazing", "leetcode", "is"};

        int countOfWords = countWords(arrayOfWordsOne, arrayOfWordsTwo);
        int countOfWordsAlternative = countOfWordsAlternative(arrayOfWordsOne, arrayOfWordsTwo);
        int countOfWordsWithTwoHashMaps = countOfWordsWithTwoHashMaps(arrayOfWordsOne, arrayOfWordsTwo);

        System.out.println(countOfWords);
        System.out.println(countOfWordsAlternative);
        System.out.println(countOfWordsWithTwoHashMaps);
    }

    //Runtime: beats 56%.
    //Memory: beats 45%.
    private int countOfWordsWithTwoHashMaps(String[] words1, String[] words2) {
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();

        for (String word : words1) {
            firstMap.put(word, firstMap.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            secondMap.put(word, secondMap.getOrDefault(word, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
            if (entry.getValue() == 1 && secondMap.getOrDefault(entry.getKey(), 0) == 1) {
                count++;
            }
        }

        return count;
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

        addWithoutDuplicates(noDuplicateWordsFirst, words1);
        addWithoutDuplicates(noDuplicateWordsSecond, words2);

        for (String word : noDuplicateWordsFirst) {
            if (noDuplicateWordsSecond.contains(word)) {
                count++;
            }
        }

        return count;
    }

    private void addWithoutDuplicates(List<String> words, String[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isReplicated = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    isReplicated = true;
                    break;
                }
                isReplicated = false;
            }

            if (!isReplicated) {
                words.add(array[i]);
            }
        }
    }

}
