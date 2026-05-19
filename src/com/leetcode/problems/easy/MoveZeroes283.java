package com.leetcode.problems.easy;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(arr1));
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{0, 0, 0, 4, 0, 8, 15};
        System.out.println(Arrays.toString(arr2));
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));

    }


    private static void moveZeroes(int[] nums) {

        int lastNonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // fill the rest with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
