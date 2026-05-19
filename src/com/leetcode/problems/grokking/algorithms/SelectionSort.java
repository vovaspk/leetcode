package com.leetcode.problems.grokking.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{5, 2, 7, 6, 4, 8, 5, 3, 9, 1, 0};
        System.out.println(Arrays.toString(selectionSort(unsortedArray)));
    }

    private static int[] selectionSort(int[] arr) {
        // Copy the array before mutating
        List<Integer> copiedArr = new ArrayList<>();
        for (int num : arr) {
            copiedArr.add(num);
        }

        List<Integer> newArr = new ArrayList<>();

        // Selection Sort logic
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = findSmallest(copiedArr);
            newArr.add(copiedArr.remove(smallestIndex));
        }

        // Convert List<Integer> back to int[]
        int[] sortedArr = new int[newArr.size()];
        for (int i = 0; i < newArr.size(); i++) {
            sortedArr[i] = newArr.get(i);
        }

        return sortedArr;
    }

    public static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
