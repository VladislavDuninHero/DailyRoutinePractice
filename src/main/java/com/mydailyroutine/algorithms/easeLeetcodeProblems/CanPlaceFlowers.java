package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//
//
//
//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true

public class CanPlaceFlowers implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] flowerBed = {1, 0, 0, 0, 1, 0, 0};
        int n = 2;

        boolean isCanPlaceFlowers = canPlaceFlowers(flowerBed, n);

        System.out.println(isCanPlaceFlowers);
    }

    //Runtime: beat 97% of other solutions runtime.
    //Memory: beat 8% of other solutions runtime.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean isCanPlace = false;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }

                if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }

                if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        if (n <= 0) {
            isCanPlace = true;
        }

        return isCanPlace;
    }
}
