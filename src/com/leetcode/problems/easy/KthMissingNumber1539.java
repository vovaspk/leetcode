package com.leetcode.problems.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KthMissingNumber1539 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 4, 7, 11};
        int[] arr2 = new int[]{1, 2, 3, 4};
        System.out.println(findKthPositive(arr1, 5));//result is 9
        System.out.println(findKthPositive(arr2, 2));//result is 6

    }
    //Input: arr = [2,3,4,7,11], k = 5
    //Output: 9
    //Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
    // The 5th missing positive integer is 9.

    //Input: arr = [1,2,3,4], k = 2
    //Output: 6
    //Explanation: The missing positive integers are [5,6,7,...].
    // The 2nd missing positive integer is 6.

    public static int findKthPositive(int[] arr, int k) {
        Set<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        return IntStream.range(1, 1000).boxed()
                .filter(num -> !array.contains(num))
                .limit(k)
                .toList()
                .getLast();

    }
}
