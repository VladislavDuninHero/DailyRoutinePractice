package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class IncreaseDecreasingString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        sortString("aaaabbbbcccc");
    }

    public String sortString(String s) {
        StringBuilder builder = new StringBuilder();

        int head = 0;
        int tail = 1;
        int count = 1;

        while (head < s.length()) {
            char current = s.charAt(head);

            if (tail >= s.length() - 1) {

                tail = 0;
                head++;
                count = 1;
            }

            if (current == s.charAt(tail)) {
                count++;
            }

            tail++;
        }

       return null;
    }

}
