package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
//
//
//
//Example 1:
//
//Input: num = "51230100"
//Output: "512301"
//Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".

public class RemoveTrailingZerosFromAString implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String num = "51230100";

        String numAfterRemoveZeros = removeTrailingZeros(num);

        System.out.println(numAfterRemoveZeros);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 56% of other solutions.
    private String removeTrailingZeros(String num) {
        if (!num.contains("0")) {
            return num;
        }

        int lastIndex = 0;

        boolean isLastZero = false;
        for (int i = num.length() - 1; i >= 0; i--) {

            if (num.charAt(i) != '0') {
                isLastZero = true;
            }

            if (!isLastZero) {
                continue;
            }

            lastIndex = i;
            break;
        }

        return num.substring(0, lastIndex + 1);
    }
}
