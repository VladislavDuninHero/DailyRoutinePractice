package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//Reversing an integer means to reverse all its digits.
//
//For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
//Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
//
//
//
//Example 1:
//
//Input: num = 526
//Output: true
//Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.

public class ANumberAfterADoubleReversal implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int num = 526;

        boolean isSameAfterReversal = isSameAfterReversals(num);
        boolean isSameAfterReversalAlternative = isSameAfterReversalsAlternative(num);

        System.out.println(isSameAfterReversal);
        System.out.println(isSameAfterReversalAlternative);
    }

    //Runtime: beats 11%.
    //Memory: beats 79%.
    private boolean isSameAfterReversals(int num) {
        int reversalNum = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        int secondReversedNum = Integer.parseInt(new StringBuilder(String.valueOf(reversalNum)).reverse().toString());


        return num == secondReversedNum;
    }

    //Runtime: beats 100%.
    //Memory: beats 22%.
    private boolean isSameAfterReversalsAlternative(int num) {
        int reversedNum = reverse(num);
        int secondReversedNum = reverse(reversedNum);

        return num == secondReversedNum;
    }

    private int reverse(int num) {
        int rev = 0;
        int remainder = 0;

        while (num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }

        return rev;
    }
}
