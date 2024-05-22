package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class FirstUniqueChar implements AlgosActionDispatcher {
    //Description:
    //Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    @Override
    public void execute() {
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqCharRuntime(s));
    }

    //High percent Memory Distribution
    private int firstUniqChar(String s) {
        int head = 0;
        int tail = s.length() - 1;
        int index = -1;

        while (head != s.length()) {


            if (tail < 0) {
                index = head;

                break;
            }

            if (s.charAt(head) == s.charAt(tail) && head != tail) {
                head++;
                tail = s.length() - 1;
                continue;
            }

            tail--;


        }

        return index;
    }

    //High percent Runtime Distribution
    private int firstUniqCharRuntime(String s) {
        int[] chars = new int[256];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
