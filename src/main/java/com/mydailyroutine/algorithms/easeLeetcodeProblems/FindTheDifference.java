package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }

    private char findTheDifference(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char result = '1';

        for (int i = 0; i < array1.length; i++) {
            if (map.containsKey(array1[i])) {
                map.put(array1[i], map.get(array1[i]) + 1);
                continue;
            }

            map.put(array1[i], 1);
        }

        for (int i = 0; i < array2.length; i++) {
            if (map2.containsKey(array2[i])) {
                map2.put(array2[i], map2.get(array2[i]) + 1);
                continue;
            }

            map2.put(array2[i], 1);
        }

        for (Map.Entry<Character, Integer> el : map2.entrySet()) {
            if (map.containsKey(el.getKey())) {
                if (map.get(el.getKey()) != el.getValue()) {
                    result = el.getKey();
                }
                continue;
            }

            result = el.getKey();
        }

        return result;
    }
}
