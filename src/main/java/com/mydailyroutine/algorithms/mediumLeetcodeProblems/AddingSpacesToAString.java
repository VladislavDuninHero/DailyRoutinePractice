package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;


//Link: https://leetcode.com/problems/adding-spaces-to-a-string/description/
//Description:
//You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original string where spaces will be added. Each space should be inserted before the character at the given index.
//
//For example, given s = "EnjoyYourCoffee" and spaces = [5, 9], we place spaces before 'Y' and 'C', which are at indices 5 and 9 respectively. Thus, we obtain "Enjoy Your Coffee".
//Return the modified string after the spaces have been added.
//
//
//
//Example 1:
//
//Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
//Output: "Leetcode Helps Me Learn"
//Explanation:
//The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
//We then place spaces before those characters.

public class AddingSpacesToAString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String word = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};

        String wordWithSpaces = addSpaces(word, spaces);

        System.out.println(wordWithSpaces);
    }

    //Runtime: beats 31% of other solutions.
    //Memory: beats 67% of other solutions.
    //Time complexity: O(nlogn + m).
    private String addSpaces(String s, int[] spaces) {
        StringBuilder builder = new StringBuilder();

        Arrays.sort(spaces);

        int index = 0;
        int spaceIndex = spaces[index];
        for (int i = 0; i < s.length(); i++) {
            if (i == spaceIndex) {
                builder.append(" ");
                index = index + 1;

                if (index < spaces.length) {
                    spaceIndex = spaces[index];
                }
            }

            builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}
