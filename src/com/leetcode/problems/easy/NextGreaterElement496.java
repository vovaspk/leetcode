package com.leetcode.problems.easy;

import java.util.*;

public class NextGreaterElement496 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2,4};
        int[] arr2 = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));
    }

    //Map<Integer, Integer> map = new HashMap<>();
    //map key=value, value=index - we can find index by value
//For each 0 <= i < nums1.length,
// find the index j such that nums1[i] == nums2[j] and
// determine the next greater element of nums2[j] in nums2.
// If there is no next greater element, then the answer for this query is -1.
//
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

    //Input: nums1 = [2,4], nums2 = [1,2,3,4]
    //Output: [3,-1]

    //Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    //Output: [-1,3,-1]

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int current : nums2) {
            while (!stack.isEmpty() && stack.peek() < current) {
                nextGreater.put(stack.pop(), current);
            }
            stack.push(current);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.getOrDefault(nums1[i], -1);
        }

        return ans;
    }


//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            ans[i] = -1;
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            int x = nums1[i];
//            int pos = -1;
//            for (int j = 0; j < nums2.length; j++) {
//                if(x == nums2[j]) {
//                    pos = j;
//                    break;
//                }
//            }
//
//            for (int j = pos + 1; j < nums2.length; j++) {
//                if(nums2[j] > x) {
//                    ans[i] = nums2[j];
//                    break;
//                }
//            }
//        }
//
//
//        return ans;
//    }
}
