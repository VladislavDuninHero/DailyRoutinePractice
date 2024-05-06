package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

public class MergeSortedArray implements AlgosActionDispatcher {
    //Description:
    //You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    //
    //Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    //
    //The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
    //
    //
    //
    //Example 1:
    //
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    //The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    //Example 2:
    //
    //Input: nums1 = [1], m = 1, nums2 = [], n = 0
    //Output: [1]
    //Explanation: The arrays we are merging are [1] and [].
    //The result of the merge is [1].
    //Example 3:
    //
    //Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    //Output: [1]
    //Explanation: The arrays we are merging are [] and [1].
    //The result of the merge is [1].
    //Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

    @Override
    public void execute() {
        int[] array1 = {1, 0, 0, 2, 4, 0, 0};
        int[] array2 = {2, 3, 4};

        int m = 5;
        int n = 3;

        merge(array1, m, array2, n);

        System.out.println(Arrays.toString(array1));
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i >= m) {
                nums1[i] = nums2[pointer];

                if (pointer != nums2.length) {
                    pointer++;
                }
            }
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i <= nums1.length - 1; i++) {
                if (nums1[i] < nums1[i - 1]) {
                    isSorted = false;
                    int temp = nums1[i];
                    nums1[i] = nums1[i - 1];
                    nums1[i - 1] = temp;
                }
            }
        }
    }
}
