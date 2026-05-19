package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        var arr1 = new int[]{1, 2, 3, 0, 0, 0};
        var arr2 = new int[]{2, 5, 6};
        merge(arr1, 3, arr2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx = 0;
        for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[idx];
                idx++;

        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
