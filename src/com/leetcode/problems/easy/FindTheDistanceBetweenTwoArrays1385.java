package com.leetcode.problems.easy;

public class FindTheDistanceBetweenTwoArrays1385 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4,5,8};
        int[] arr2 = new int[]{10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;

        for (int k : arr1) {
            int currentNumPass = 0;

            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    break;
                } else {
                    currentNumPass++;
                }
            }
            if (currentNumPass == arr2.length) {
                res++;
            }

        }


        return res;
    }
}
