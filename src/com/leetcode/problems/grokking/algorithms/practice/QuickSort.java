package com.leetcode.problems.grokking.algorithms.practice;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArr = quickSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    private static int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr; // Base case: arrays with 0 or 1 element are already sorted
        } else {
            int pivot = arr[0];

            // Use ArrayLists to store the elements less than and greater than the pivot
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            // Partition the array into two parts
            for (int i = 1; i < arr.length; i++) { // Start from index 1 to skip the pivot
                if (arr[i] < pivot) {
                    left.add(arr[i]);
                } else {
                    right.add(arr[i]);
                }
            }

            // Combine the sorted left subarray, pivot, and sorted right subarray
            return concatenate(
                    quickSort(left.stream().mapToInt(i -> i).toArray()),
                    pivot,
                    quickSort(right.stream().mapToInt(i -> i).toArray()));
        }
    }

    private static int[] concatenate(int[] left, int pivot, int[] right) {
        int[] result = new int[left.length + right.length + 1];

        System.arraycopy(left, 0, result, 0, left.length);
        result[left.length] = pivot;
        System.arraycopy(right, 0, result, left.length + 1, right.length);

        return result;
        }
}
