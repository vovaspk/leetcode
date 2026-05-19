package com.leetcode.problems.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges163 {
    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
    }

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        int start = lower;

        for (int curr : nums) {
            if (start == curr) {
                start++;
            } else {
                result.add(Arrays.asList(start, curr-1));
                start = curr + 1;
            }
        }

        if (start <= upper) result.add(Arrays.asList(start, upper));

        return result;
    }

    //My solution:)
//    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (nums.length == 0) {
//
//            result.add(List.of(lower, upper));
//            return result;
//        }
//
//        if (nums.length == 0 || nums.length == 1) {
//            return new ArrayList<>();
//        }
//
//
//        //handle lower
//        if (lower < nums[0]) {
//            result.add(List.of(lower + 1, nums[0] - 1));
//        }
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            List<Integer> range = new ArrayList<>();
//            int curr = nums[i];
//            int next = nums[i + 1];
//
//            if (next - curr != 1) {
//                range.add(curr + 1);
//            }
//            for (int j = curr + 1; j < next; j++) {
//                if (j == next - 1) {
//                    range.add(j);
//                }
//            }
//            result.add(range);
//        }
//
//        //handle upper
//        if (upper > nums[nums.length - 1]) {
//            result.add(new ArrayList<>(List.of(nums[nums.length - 1] + 1, upper)));
//        }
//
//        return result.stream().filter(l -> !l.isEmpty()).toList();
//    }
}
