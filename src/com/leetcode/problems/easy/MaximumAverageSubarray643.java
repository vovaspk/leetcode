package com.leetcode.problems.easy;

import java.util.List;
import java.util.stream.Stream;

public class MaximumAverageSubarray643 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        //expected Output: 12.75000
        //Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    }

    public static double findMaxAverage(int[] nums, int k) {
        int startIdx = 0;
        int endIdx = k - 1;

        double maxAverage = Double.NEGATIVE_INFINITY;

        Stream.of(List.of(1,2));


        while(endIdx < nums.length) {
            double currentAverage = 0;
            for (int i = startIdx; i <= endIdx; i++) {
                currentAverage += nums[i];
            }
            currentAverage = currentAverage / k;

            startIdx++;
            endIdx++;

            if(currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }
        return maxAverage;
    }
}
