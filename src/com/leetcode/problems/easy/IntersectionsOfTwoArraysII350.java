package com.leetcode.problems.easy;

public class IntersectionsOfTwoArraysII350 {
    public static void main(String[] args) {
        IntersectionsOfTwoArraysII350 solution = new IntersectionsOfTwoArraysII350();

        int[] nums1a = {1, 2, 2, 1};
        int[] nums2a = {2, 2};
        int[] result1 = solution.intersect(nums1a, nums2a);
        System.out.println(java.util.Arrays.toString(result1));

        int[] nums1b = {4, 9, 5};
        int[] nums2b = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersect(nums1b, nums2b);
        System.out.println(java.util.Arrays.toString(result2));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        //TODO finish?
        return new int[1];
    }
}
