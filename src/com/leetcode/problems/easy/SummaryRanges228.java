package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        summaryRanges(new int[] {0,1,2,4,5,7}).forEach(System.out::println);
    }

    //Input: nums = [0,1,2,4,5,7]
    //Output: ["0->2","4->5","7"]
    //Explanation: The ranges are:
    //[0,2] --> "0->2"
    //[4,5] --> "4->5"
    //[7,7] --> "7"

    private static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums.length == 0) {
            return res;
        }

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int previous = nums[i - 1];
            if (curr != previous + 1) {
                if (start == previous) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + previous);
                }

                start = curr;
            }
        }

        int last = nums[nums.length - 1];

        if (start == last) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + last);
        }

        return res;
    }
}
