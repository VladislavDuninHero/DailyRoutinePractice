package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
//
//Return the maximum distance between two houses with different colors.
//
//The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
//
//
//
//Example 1:
//
//
//Input: colors = [1,1,1,6,1,1,1]
//Output: 3
//Explanation: In the above image, color 1 is blue, and color 6 is red.
//The furthest two houses with different colors are house 0 and house 3.
//House 0 has color 1, and house 3 has color 6. The distance between them is abs(0 - 3) = 3.
//Note that houses 3 and 6 can also produce the optimal answer.

public class TwoFurthestHousesWithDifferentColors implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] altColors = {4, 4, 4, 11, 4, 4, 11, 4, 4, 4, 4, 4};

        int maxDistance2 = maxDistance(altColors);

        System.out.println(maxDistance2);
    }

    //Runtime: beats 100%.
    //Memory: beats 58%.
    private int maxDistance(int[] colors) {
        int maxDistanceOnLeftPointer = 0;
        int maxDistanceOnRightPointer = 0;

        int head = 0;
        int tail = colors.length - 1;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != colors[tail]) {
                maxDistanceOnRightPointer = tail - i;
                break;
            }
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (colors[i] != colors[head]) {
                maxDistanceOnLeftPointer = i - head;
                break;
            }
        }

        return Math.max(maxDistanceOnLeftPointer, maxDistanceOnRightPointer);
    }
}
