package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
//
//A string is palindromic if it reads the same forward and backward.
//
//
//
//Example 1:
//
//Input: words = ["abc","car","ada","racecar","cool"]
//Output: "ada"
//Explanation: The first string that is palindromic is "ada".
//Note that "racecar" is also palindromic, but it is not the first.

public class FindFirstPalindromicStringInTheArray implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        String firstPalindromeString = firstPalindrome(words);

        System.out.println(firstPalindromeString);
    }

    //Runtime: beats 41%.
    //Memory: beats 46%.
    private String firstPalindrome(String[] words) {
        String firstPalindromeString = "";

        for (int i = 0; i < words.length; i++) {
            String reverseWord = new StringBuilder(words[i]).reverse().toString();

            if (reverseWord.equals(words[i])) {
                firstPalindromeString = words[i];
                break;
            }
        }

        return firstPalindromeString;
    }
}
