package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThirdMaximumNumber414 {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {3,2,1}));
        System.out.println(thirdMax(new int[] {1,2}));
        System.out.println(thirdMax(new int[] {2,2,3,1}));
    }
    private static int thirdMax(int[] nums) {

        var sorted = Arrays.stream(nums).distinct().sorted().toArray();

        if(sorted.length < 3) {
            return sorted[sorted.length - 1];
        }

        return sorted[sorted.length - 3];
    }
}
