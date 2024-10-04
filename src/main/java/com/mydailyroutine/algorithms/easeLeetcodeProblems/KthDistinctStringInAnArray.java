package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class KthDistinctStringInAnArray implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String[] array = {"d", "b", "c", "b", "c", "a"};
        int k = 2;

        String distinctElement = kthDistinct(array, k);

        System.out.println(distinctElement);
    }

    private String kthDistinct(String[] arr, int k) {

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(i, arr[i]);
        }

        for (String str : list) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
                continue;
            }

            map.put(str, map.get(str) + 1);
        }



        System.out.println(map);


        return null;
    }
}

