package com.leetcode.problems.easy.arrays;

import java.util.Arrays;

public class MissingNumber268 {
    void main() {
        System.out.println(missingNumber(new int[]{3, 0, 1}));//2
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));//8
        System.out.println(missingNumber(new int[]{1}));//1 -> should be 0
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }
        if (nums[n - 1] != n) {
            return n;
        }
        for (int i = 0; i < n - 1; i++) {

            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }


        }

        return n;
    }
}
