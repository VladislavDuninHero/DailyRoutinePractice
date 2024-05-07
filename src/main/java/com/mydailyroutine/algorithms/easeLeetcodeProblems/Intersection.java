package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class Intersection implements AlgosActionDispatcher {
    @Override
    public void execute() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 4, 1};

        int[] result = intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

    private int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            numsSet.add(num);
        }

        for (int num : nums2) {
            if (numsSet.contains(num)) {
                list.add(num);
                numsSet.remove(num);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
