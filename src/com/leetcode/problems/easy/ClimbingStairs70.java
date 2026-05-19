package com.leetcode.problems.easy;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));

    }

    private static int climbStairs(int n) {

        return climbStairs(n, new int[n + 1]);


        //return climbStairs(n - 1) + climbStairs(n - 2);

    }

    private static int climbStairs(int n, int[] memo) {
        if (n <= 2) return n;

        if (memo[n] != 0) return memo[n];

        memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        return memo[n];
    }
}
