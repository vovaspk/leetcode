package com.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SlidingWindowProblem {
    //find the length of the longest subarray that has a sum less than or equal to 5
    //[3, 2, 1, 3, 1, 1]
    public void getWindowsLessThen10(int[] nums, int k) {
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet<String> set = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //HashMap.newHashMap()

        int left = 0;
        int curr = 0; // curr is the current sum of the window
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}
