package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String order = "cba";
        String s = "abcd";

        String customString = customSortString(order, s);

        System.out.println(customString);
    }

    private String customSortString(String order, String s) {

        StringBuilder builder = new StringBuilder();

        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), i);
        }

        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }


        return null;
    }
}
