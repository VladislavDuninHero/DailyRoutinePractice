package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Description:
//There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
//
//You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:
//
//The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
//The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
//For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
//
//Return the number of rods that have all three colors of rings on them.
//
//
//
//Example 1:
//
//
//Input: rings = "B0B6G0R6R0R6G9"
//Output: 1
//Explanation:
//- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
//- The rod labeled 6 holds 3 rings, but it only has red and blue.
//- The rod labeled 9 holds only a green ring.
//Thus, the number of rods with all three colors is 1.

public class RingsAndRods implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String rings = "B9R9G0R4G6R8R2R9G9";

        int countOfPoints = countPoints(rings);

        System.out.println(countOfPoints);
    }

    //Runtime: beats 14%.
    //Memory: beats 10%.
    private int countPoints(String rings) {
        Map<Character, String> ringsMap = new HashMap<>();

        int count = 0;

        String target = "BGR";

        for (int i = 0; i < rings.length(); i++) {
            if (Character.isDigit(rings.charAt(i))) {
                String letter = String.valueOf(rings.charAt(i - 1));

                if (ringsMap.containsKey(rings.charAt(i))) {

                    if (ringsMap.get(rings.charAt(i)).contains(letter)) {
                        continue;
                    }

                    ringsMap.put(rings.charAt(i), ringsMap.get(rings.charAt(i)) + letter);
                    continue;
                }


                ringsMap.put(rings.charAt(i), letter);
            }
        }

        for (Map.Entry<Character, String> entry : ringsMap.entrySet()) {
            String value = entry.getValue();

            if (value.length() < 3) {
                continue;
            }

            String[] valueSplit = value.split("");
            Arrays.sort(valueSplit);

            String sortedValue = String.join("", valueSplit);

            if (sortedValue.equals(target)) {
                count++;
            }
        }

        return count;
    }
}
