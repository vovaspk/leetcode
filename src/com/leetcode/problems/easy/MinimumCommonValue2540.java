package com.leetcode.problems.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinimumCommonValue2540 {
    public static void main(String[] args) {

    }

    private int getCommon(int[] nums1, int[] nums2) {
        int res = -1;
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
}
