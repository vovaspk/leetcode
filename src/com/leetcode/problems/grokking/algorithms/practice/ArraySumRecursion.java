package com.leetcode.problems.grokking.algorithms.practice;

import java.util.ArrayList;
import java.util.List;

public class ArraySumRecursion {
    public static void main(String[] args) {
        List<Integer> unsortedArray =
                new ArrayList<>(List.of(5, 2, 7, 6, 4, 8, 3, 9, 1, 0));
        int sum = findSumRecursive(unsortedArray);
        System.out.println(sum);
    }

    private static int findSumRecursive(List<Integer> unsortedArray) {
        List<Integer> copiedArr = new ArrayList<>(unsortedArray);
        int sum = copiedArr.removeLast();

        if (copiedArr.isEmpty()) {
            return sum;
        }

        return sum + findSumRecursive(copiedArr);

    }
}
