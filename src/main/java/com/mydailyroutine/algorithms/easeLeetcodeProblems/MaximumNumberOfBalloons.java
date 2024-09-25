package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfBalloons implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String text = "loonbalxballpoon";

        int maxNumberOfBalloons = maxNumberOfBalloons(text);

        System.out.println(maxNumberOfBalloons);
    }

    private int maxNumberOfBalloons(String text) {
        String balloon = "balloon";

        StringBuilder builder = new StringBuilder();

        char[] letters = text.toCharArray();

        List<String> balloons = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < balloon.length(); j++) {
                if (balloon.charAt(j) == letters[i]) {
                    builder.append(balloon.charAt(j));

                    letters[i] = 0;

                    break;
                }
            }

            String potentialBalloon = builder.toString();

            if (potentialBalloon.equals(balloon)) {
                balloons.add(potentialBalloon);

                builder.delete(0, builder.length());
            }
        }

        return balloons.size();
    }
}
