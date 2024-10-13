package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


//Description:
//Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
//
//
//
//Example 1:
//
//Input: s = "foobar", letter = "o"
//Output: 33
//Explanation:
//The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.

public class PercentageOfLetterInString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String target = "foobar";
        char letter = 'o';

        int percent = percentageLetter(target, letter);

        System.out.println(percent);
    }

    //Runtime: beats 100%.
    //Memory: beats 92%.
    private int percentageLetter(String s, char letter) {
        if (s.isEmpty()) {
            return 0;
        }

        int countOfLetter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                countOfLetter++;
            }
        }

        if (countOfLetter == 0) {
            return 0;
        }

        double percentage = (double) countOfLetter / s.length() * 100;

        return (int) percentage;
    }
}
