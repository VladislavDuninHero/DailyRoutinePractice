package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInAnArray implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] array = {15, 6, 18, 17, 5, 16, 18, 2, 16, 9, 19, 19, 20, 15, 11, 1, 17, 8, 18, 14, 19, 20, 12, 8, 16, 17, 19, 17, 5, 20, 17, 12, 6, 18, 1, 1, 16, 16, 13, 1, 15, 12, 16, 19, 20, 20, 10, 10, 19, 8, 4, 16, 10, 15, 20, 20, 11, 13, 17, 16, 16, 1, 1, 2, 9, 9, 7, 18, 10, 7, 18, 12, 7, 20, 17, 14, 13, 12, 19, 16, 17, 1, 13, 12, 20, 15, 5, 8, 7, 14, 20, 2, 17, 18, 4, 13, 12, 1, 19, 14, 3, 14, 2, 15, 15, 4, 13, 7, 8, 15, 9, 8, 10, 20, 9, 16, 15, 9, 10, 16, 18, 3, 18, 15, 14, 7, 8, 20, 20, 11, 6, 17, 7, 19, 19, 1, 4, 7, 14, 18, 8, 10, 11, 3, 3, 6, 17, 4, 1, 1, 20, 16, 7, 5, 6, 10, 1, 19, 8, 20, 19, 14, 11, 1, 9, 15, 7, 19, 14, 10, 13, 3, 3, 1, 14, 18, 12, 5, 19, 4, 2, 14, 15, 11, 17, 2, 5, 8, 12, 14, 16, 16, 6, 20, 2, 13, 2, 2, 9, 8, 1, 7, 14, 3, 11, 2, 20, 7, 6, 20, 1, 2, 19, 10, 3, 5, 1, 9, 19, 10, 1, 7, 2, 11, 16, 11, 2, 1, 3, 12, 2, 10, 16, 6, 8, 9, 8, 19, 13, 8, 6, 20, 6, 6, 18, 9, 4, 14, 3, 14, 12, 16, 4, 3, 3, 17, 2, 17, 7, 18, 13, 17, 2, 12, 20, 6, 17, 1, 13, 12, 10, 8, 13, 2, 13, 5, 14, 10, 6};

        System.out.println(findLucky(array));
    }

    private int findLucky(int[] arr) {


        Map<Integer, Integer> statistic = new HashMap<>();

//        fillStatistic(arr, statistic);

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    counter++;
                }
            }

            if (counter == arr[i]) {
                statistic.put(arr[i], counter);
            }

            counter = 0;
        }


        int maxValue = Integer.MIN_VALUE;
        int maxKey = -1;
        for (Map.Entry<Integer, Integer> number : statistic.entrySet()) {
            if (number.getValue() > maxValue && number.getKey() > maxKey) {
                maxKey = number.getValue();
            }
        }

        return maxKey;
    }

//    private void fillStatistic(int[] arr, Map<Integer, Integer> statistic) {
//        int head = 0;
//        int tail = arr.length - 1;
//        int counter = 0;
//
//        while (head < tail) {
//            if (head == tail) {
//                head++;
//                tail = arr.length - 1;
//
//                if (arr[head] == counter) {
//                    statistic.put(arr[head], counter);
//                }
//            }
//
//            if (arr[tail] == arr[head]) {
//                counter++;
//            }
//
//            tail--;
//        }
//    }
}
