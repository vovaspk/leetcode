package com.leetcode.problems.easy;

import java.util.Arrays;

public class RangeSumQuery303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));
    }

    private static class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            arr = new int[nums.length];
            arr = Arrays.copyOf(nums, nums.length);
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for(int i = left; i<=right; i++) {
                sum+=arr[i];
            }
            return sum;
        }
    }
}
