package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonArrayOfTwoArrays2657 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePrefixCommonArray(
                                new int[]{1, 3, 2, 4},
                                new int[]{3, 1, 2, 4}
                        )
                )
        );
    }

    private static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        Map<Integer, Integer> freq = new HashMap<>();

        int common = 0;

        for (int i = 0; i < A.length; i++) {
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
            if (freq.get(A[i]) == 2) {
                common++;
            }

            freq.put(B[i], freq.getOrDefault(B[i], 0) + 1);
            if (freq.get(B[i]) == 2) {
                common++;
            }

            res[i] = common;
        }

        return res;
    }
}
