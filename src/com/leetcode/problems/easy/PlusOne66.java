package com.leetcode.problems.easy;

import java.util.Arrays;

public class PlusOne66 {
    public static void main() {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));//10
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));//100
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9})));//130
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));//1000
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 9})));//1000
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
