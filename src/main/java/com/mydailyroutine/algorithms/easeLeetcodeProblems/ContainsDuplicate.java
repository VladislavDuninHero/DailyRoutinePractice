package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate implements AlgosActionDispatcher {

    @Override
    public void execute() {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 5, -2, -4, 0};
        System.out.println("Contains duplicate: " + containsDuplicate(nums2));
    }

    private boolean containsDuplicate(int[] nums) {
        boolean isHaveDuplicate = false;

        Set<Integer> numsSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        if (numsSet.size() != nums.length) {
            isHaveDuplicate = true;
        }

        return isHaveDuplicate;
    }
}
