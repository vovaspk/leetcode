package com.leetcode.problems.easy;

public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currMax++;
                if (currMax > max) {
                    max = currMax;
                }
            } else {
                currMax = 0;
            }
        }
        return max;
    }
}
