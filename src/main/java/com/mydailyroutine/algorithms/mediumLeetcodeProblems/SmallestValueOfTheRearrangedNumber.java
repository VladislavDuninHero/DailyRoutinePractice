package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class SmallestValueOfTheRearrangedNumber implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int num = -7605;

        long smallestNumber = smallestNumber(num);
        System.out.println(smallestNumber);
    }

    private long smallestNumber(long num) {
        long smallestNumber = 0;

        String[] splitNumber = String.valueOf(num).split("");

        Arrays.sort(splitNumber);


        for (int i = 0; i < splitNumber.length; i++) {
            int parseInt = 0;

            if (!splitNumber[i].equals("-")) {
                parseInt = Integer.parseInt(splitNumber[i]);
            } else {
                continue;
            }

            if (parseInt == 0) {
                splitNumber[i] = splitNumber[i + 1];
                splitNumber[i + 1] = String.valueOf(parseInt);
                break;
            }
        }

        System.out.println(Arrays.toString(splitNumber));

        int i = 0;
        if (splitNumber[0].equals("-")) {
            i = 1;
        }

        StringBuilder builder = new StringBuilder();
        for (int j = i; j < splitNumber.length; j++) {
            builder.append(splitNumber[j]);
        }

        if (splitNumber[0].equals("-")) {
            smallestNumber = -Long.parseLong(builder.toString());

            return smallestNumber;
        }

        return Long.parseLong(builder.toString());
    }
}
