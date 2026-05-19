package com.leetcode.problems.grokking.algorithms;

import java.sql.Timestamp;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) throws InterruptedException {
//        //long start = System.currentTimeMillis();
//        System.out.println("1 start: " + ts());
//        int result = linearSearch(IntStream.rangeClosed(1, 1000000).toArray(), 2);
//        System.out.println(result);
//        System.out.println("1 end: " + ts());
//
//        System.out.println("2 start: " + ts());
//        int result2 = binarySearch(IntStream.rangeClosed(1, 1000000).toArray(), 2);
//        System.out.println(result2);
//        System.out.println("2 start: " + ts());

        int[] array = generateSortedArray(1000000); // Generate a sorted array with 1 million elements
        int target = 999999; // The target value to search for

        // Linear Search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long endTime = System.nanoTime();
        long linearDuration = endTime - startTime;
        System.out.println("Linear Search Result: " + linearResult);
        System.out.println("Linear Search Time: " + linearDuration + " nanoseconds");

        // Binary Search
        startTime = System.nanoTime();
        int binaryResult = binarySearch(array, target);
        endTime = System.nanoTime();
        long binaryDuration = endTime - startTime;
        System.out.println("Binary Search Result: " + binaryResult);
        System.out.println("Binary Search Time: " + binaryDuration + " nanoseconds");

    }


//    public static int binarySearch(int[] array, int target) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (array[mid] == target) {
//                return mid;
//            }
//
//            if (array[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }

    private static Integer binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (arr[middle] == item) {
                return arr[middle];
            } else if (arr[middle] > item) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }
        return -1;
    }

    private static Integer linearSearch(int[] arr, int item) throws InterruptedException {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == item){
                return arr[i];
            }
        }
        return -1;
    }

    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static String ts() {
        return "Timestamp: " + new Timestamp(new java.util.Date().getTime());
    }
}
