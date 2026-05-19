package com.leetcode.problems.easy.arrays;

import java.util.*;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

        int[] nums3 = new int[]{4, 9, 5};
        int[] nums4 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));

        int[] nums5 = new int[]{4, 9, 5};
        int[] nums6 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersectionFaster(nums5, nums6)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer1 = 0;
        int pointer2 = 0;

        Set<Integer> intersection = new HashSet<>();
        while (pointer1 != nums1.length && pointer2 != nums2.length) {

            if (nums1[pointer1] == nums2[pointer2]) {
                intersection.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else if (nums1[pointer1] > nums2[pointer2]) {
                pointer2++;
            }
        }

        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersectionFaster(int[] nums1, int[] nums2) {
       if(nums2.length < nums1.length) return intersectionFaster(nums2, nums1);

       Set<Integer> res = new HashSet<>();

       Set<Integer> set1 = new HashSet<>();
       for (int i : nums1) set1.add(i);

        for (int j : nums2) {
            if(set1.contains(j)) {
                res.add(j);
            }
        }



        return res.stream().mapToInt(Integer::intValue).toArray();
    }


}
