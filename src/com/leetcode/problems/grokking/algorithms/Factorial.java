package com.leetcode.problems.grokking.algorithms;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
