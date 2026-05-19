package com.leetcode.problems.grokking.algorithms.practice;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearchRecursive(list, 3, 0, list.size() - 1));


    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int middle = (low + high) / 2;

            if (arr[middle] == target) {
                return arr[middle];
            } else if (arr[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }


        return -1;
    }

    private static int binarySearchRecursive(List<Integer> arr, int target, int low, int high) {
        int middle = (low + high) / 2;
        if(target == arr.get(middle)) {
            return arr.get(middle);
        } else if(target > middle) {
            return binarySearchRecursive(arr, target, middle, high);
        } else {
            return binarySearchRecursive(arr, target, low, middle);
        }

    }
}
