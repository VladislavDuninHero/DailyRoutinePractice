package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

//Description:
//You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
//
//For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
//Return names sorted in descending order by the people's heights.
//
//
//
//Example 1:
//
//Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//Output: ["Mary","Emma","John"]
//Explanation: Mary is the tallest, followed by Emma and John.

public class SortThePeople implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortPeople = sortPeople(names, heights);

        System.out.println(Arrays.toString(sortPeople));
    }

    //Runtime: beats 50% of other solutions;
    //Memory: beats 79% of other solutions;
    private String[] sortPeople(String[] names, int[] heights) {
        String[] people = new String[names.length];

        NavigableMap<Integer, String> peopleMap = new TreeMap<>();

        for (int i = 0; i < names.length; i++) {
            peopleMap.put(heights[i], names[i]);
        }

        peopleMap = peopleMap.descendingMap();

        int i = 0;
        for (String name : peopleMap.values()) {
            people[i] = name;
            i++;
        }

        return people;
    }
}
