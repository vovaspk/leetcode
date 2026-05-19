package com.leetcode.problems.grokking.algorithms.practice;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 7, 8, 10};
        printMultiplicationTable(array);
    }

    private static void printMultiplicationTable(int[] array) {
        int size = array.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = array[i] * array[j];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
