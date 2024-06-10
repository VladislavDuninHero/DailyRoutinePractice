package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide implements AlgosActionDispatcher {

    //Description:
    //Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
    //
    //After doing so, return the array.
    //
    //
    //
    //Example 1:
    //
    //Input: arr = [17,18,5,4,6,1]
    //Output: [18,6,6,6,1,-1]
    //Explanation:
    //- index 0 --> the greatest element to the right of index 0 is index 1 (18).
    //- index 1 --> the greatest element to the right of index 1 is index 4 (6).
    //- index 2 --> the greatest element to the right of index 2 is index 4 (6).
    //- index 3 --> the greatest element to the right of index 3 is index 4 (6).
    //- index 4 --> the greatest element to the right of index 4 is index 5 (1).
    //- index 5 --> there are no elements to the right of index 5, so we put -1.
    //Example 2:
    //
    //Input: arr = [400]
    //Output: [-1]
    //Explanation: There are no elements to the right of index 0.

    @Override
    public void execute() {
        int[] arr = {17, 18, 5, 4, 6, 1};

        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    private int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int head = 0;
        int tail = arr.length - 1;
        int max = -1;

        while (head != arr.length) {


            if (tail == head) {
                tail = arr.length - 1;
                arr[head] = max;
                head++;
                max = -1;
                continue;
            }

            if (head == arr.length) {
                arr[head] = -1;
                break;
            }


            if (arr[tail] > max) {
                max = arr[tail];
            }


            tail--;
        }

        return arr;
    }
}
