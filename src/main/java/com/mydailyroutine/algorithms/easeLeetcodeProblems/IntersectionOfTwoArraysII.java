package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Description:
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]

public class IntersectionOfTwoArraysII implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] firstNumsArray = {1,2,2,1};
        int[] secondNumsArray = {2, 2};

        int[] intersect = intersect(firstNumsArray, secondNumsArray);

        System.out.println(Arrays.toString(intersect));
    }

    //Runtime: beats 5%.
    //Memory: beats 74%.
    private int[] intersect(int[] firstNumsArray, int[] secondNumsArray) {
        List<Integer> ListOfFirstArray = new ArrayList<>();
        List<Integer> listOfIntersects = new ArrayList<>();

        for (Integer num : firstNumsArray) {
            Collections.addAll(ListOfFirstArray, num);
        }

        for (Integer num : secondNumsArray) {
            if (ListOfFirstArray.contains(num)) {
                listOfIntersects.add(num);
                ListOfFirstArray.remove(num);
            }
        }

        int[] intersection = new int[listOfIntersects.size()];

        for (int i = 0; i < listOfIntersects.size(); i++) {
            intersection[i] = listOfIntersects.get(i);
        }

        return intersection;
    }
}
