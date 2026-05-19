package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist1346 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 5, 3};//true 20,4,10,6
        System.out.println(checkIfExist(arr));

        int[] arr2 = new int[]{3, 1, 7, 11};//false 6,2,14,22
        System.out.println(checkIfExist(arr2));
        int[] arr3 = new int[]{7, 1, 14, 11};//should be true
        System.out.println(checkIfExist(arr3));

    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] * 2, i);
        }

        //should take arr[i] and check if exists other number*2 in map
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int possibleDouble = map.getOrDefault(arr[i + 1] * 2, 0);
            if (possibleDouble != 0 && curr * 2 == possibleDouble) {
                //this will always work because it considers first number which is always in a map
                return true;
            }
        }

        return false;
    }
}
