package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingStarsFromAString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String strWithStars = "leet**cod*e";

        String strWithoutStars = removeStars(strWithStars);

        System.out.println(strWithoutStars);
    }

    private String removeStars(String s) {

        int lastIndex = s.lastIndexOf("*");
        String[] splitString = s.split("");
        int[] starsIndices = new int[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("*")) {
                starsIndices[i] = i;
            }
        }

        int countOfStars = 0;
        for (int i = 1; i <= splitString.length - 1; i++) {

            if (i + 1 < splitString.length && splitString[i].equals("*") && !splitString[i + 1].equals("*")) {
                splitString[i - 1] = "*";
                continue;
            }

            if (splitString[i + 1].equals("*")) {
                countOfStars++;
            }
        }

        System.out.println(Arrays.toString(splitString));
        System.out.println(Arrays.toString(starsIndices));

        StringBuilder builder = new StringBuilder();
        for (String word : splitString) {
            if (!word.equals("*")) {
                builder.append(word);
            }
        }


        return builder.toString();
    }
}
