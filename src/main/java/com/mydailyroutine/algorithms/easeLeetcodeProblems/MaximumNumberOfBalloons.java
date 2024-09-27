package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumNumberOfBalloons implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String text = "loonbalxballpoon";

        int maxNumberOfBalloons = maxNumberOfBalloons(text);

        System.out.println(maxNumberOfBalloons);
    }

    private int maxNumberOfBalloons(String text) {
        String balloon = "balloon";

        String[] targetArray = text.split("");

        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (!frequency.containsKey(text.charAt(i))) {
                frequency.put(text.charAt(i), 1);
                continue;
            }

            frequency.put(text.charAt(i), frequency.get(text.charAt(i)) + 1);
        }

        List<String> listOfBalloons = new ArrayList<>();
        StringBuilder builder = new StringBuilder();



        System.out.println(listOfBalloons);

        return 0;
    }
}
