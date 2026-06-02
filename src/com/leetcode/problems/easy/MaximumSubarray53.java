package com.leetcode.problems.easy;

public class MaximumSubarray53 {
    public static void main(String[] args) {

    }

    private static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        if(nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
