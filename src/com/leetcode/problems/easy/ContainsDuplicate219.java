package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));//true
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));//false
    }

    //Given an integer array nums and an integer k,
    // return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if(lastSeen.containsKey(num)) {
                int previousIndex = lastSeen.get(num);
                if(i - previousIndex <=k) {
                    return true;
                }

            }

            lastSeen.put(nums[i], i);
        }

        return false;
    }
}
