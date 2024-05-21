package com.mydailyroutine.algorithms.search;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class BinarySearch implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(search(nums, 2));
    }

    private int search (int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == num) {
                answer = mid;
                break;
            } else if (num < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return answer;
    }

}
