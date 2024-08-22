package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


//Description:
//A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.
//
//For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
//Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).
//
//Return true if so, or false otherwise.
//
//
//
//Example 1:
//
//example-1
//Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
//Output: true
//Explanation: The numbers in s are: 1, 3, 4, 6, 12.
//They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.

public class CheckIfNumbersAreAscendingInASentence implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";

        boolean isAscending = areNumbersAscending(s);

        System.out.println(isAscending);
    }

    //Runtime: beats 94% of other submissions runtime.
    //Memory: beats 69% of other submissions runtime.
    private boolean areNumbersAscending(String s) {

        boolean isAsc = false;

        String[] tokens = s.split(" ");

        int currentNum = Integer.MIN_VALUE;
        for (String token : tokens) {
            if (isNumber(token)) {
                int parseNum = Integer.parseInt(token);

                if (parseNum > currentNum) {
                    currentNum = parseNum;
                    isAsc = true;
                } else {
                    isAsc = false;
                    break;
                }
            }
        }

        return isAsc;
    }

    private boolean isNumber(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
