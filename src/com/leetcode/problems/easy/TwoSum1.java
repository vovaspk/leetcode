package com.leetcode.problems.easy;

import java.util.*;

public class TwoSum1 {
    public static void main(String[] args) {

    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        int[] res = new int[2];

        if(nums.length == 2) {
            res[0] = 0;
            res[1] = 1;
            return res;
        }

        for (int i=0; i< nums.length; i++) {
            int search = target - nums[i];
            if(numToIndex.containsKey(search)) {
                return new int[]{numToIndex.get(search), i};
            }
            numToIndex.put(nums[i], i);
        }

        return res;
    }
}
