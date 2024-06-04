package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class JewelsAndStones implements AlgosActionDispatcher {

    //Description:
    //You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
    //
    //Letters are case sensitive, so "a" is considered a different type of stone from "A".
    //
    //
    //
    //Example 1:
    //
    //Input: jewels = "aA", stones = "aAAbbbb"
    //Output: 3
    //Example 2:
    //
    //Input: jewels = "z", stones = "ZZ"
    //Output: 0

    @Override
    public void execute() {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    //Beats 100% users with Java
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsPointer = 0;
        int stonesPointer = 0;
        int countOfJewels = 0;

        while (jewelsPointer != jewels.length()) {
            if (jewels.charAt(jewelsPointer) == stones.charAt(stonesPointer)) {
                countOfJewels++;
            }

            if (stonesPointer == stones.length() - 1) {
                jewelsPointer++;
                stonesPointer = 0;
                continue;
            }


            stonesPointer++;
        }

        return countOfJewels;
    }
}
