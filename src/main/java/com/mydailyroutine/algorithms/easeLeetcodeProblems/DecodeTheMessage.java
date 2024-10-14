package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Description:
//You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
//
//Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
//Align the substitution table with the regular English alphabet.
//Each letter in message is then substituted using the table.
//Spaces ' ' are transformed to themselves.
//For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
//Return the decoded message.
//
//
//
//Example 1:
//
//
//Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
//Output: "this is a secret"
//Explanation: The diagram above shows the substitution table.
//It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".

public class DecodeTheMessage implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        String decode = decodeMessage(key, message);

        System.out.println(decode);
    }

    //Runtime: beats 5%.
    //Memory: beats 56%.
    private String decodeMessage(String key, String message) {
        String[] splitMessage = message.split("");

        StringBuilder decode = new StringBuilder();

        List<String> alphabet = List.of(
                "A", "B", "C", "D", "E",
                "F", "G", "H", "I",
                "J", "K", "L", "M",
                "N", "O", "P", "Q",
                "R", "S", "T", "U",
                "V", "W", "X", "Y",
                "Z"
        );

        List<String> unique = new ArrayList<>();

        for (int i = 0; i < key.length(); i++) {
            if (
                    Character.isLetter(key.charAt(i)) && !unique.contains(Character.toString(key.charAt(i)))
            ) {
                unique.add(Character.toString(key.charAt(i)));
            }
        }

        Map<String, String> relations = new HashMap<>();
        for (int i = 0; i < unique.size(); i++) {
            relations.put(unique.get(i), alphabet.get(i).toLowerCase());
        }

        for (String currentLetter : splitMessage) {
            if (!currentLetter.isBlank()) {
                decode.append(relations.get(currentLetter));
                continue;
            }

            decode.append(" ");
        }

        return decode.toString();
    }
}
