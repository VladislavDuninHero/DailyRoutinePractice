package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

//Description:
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//
//
//Example 1:
//
//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

public class SortingTheSentence implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String sentence = "is2 sentence4 This1 a3";

        String sortedSentence = sortSentence(sentence);

        System.out.println(sortedSentence);
    }

    private String sortSentence(String s) {

        String[] arrayOfString = s.split(" ");
        Map<String, String> mapOfWords = new HashMap<>();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arrayOfString.length; i++) {
            mapOfWords.put(
                    String.valueOf(arrayOfString[i].charAt(arrayOfString[i].length() - 1)),
                    arrayOfString[i].substring(0, arrayOfString[i].length() - 1)
            );
        }

        for (String value : mapOfWords.values()) {
            builder.append(" ");
            builder.append(value);
        }

        String formatString = builder.toString().trim();

        return formatString;
    }
}
