package com.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{1, 2, 3, 1};

        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));

    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
