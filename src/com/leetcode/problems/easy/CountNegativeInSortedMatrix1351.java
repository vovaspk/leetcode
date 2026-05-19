package com.leetcode.problems.easy;

public class CountNegativeInSortedMatrix1351 {

    public static void main(String[] args) {
        int[][] arr1 = new int[][]
                {
                        {4, 3, 2, -1},
                        {3, 2, 1, -1},
                        {1, 1, -1, -2},
                        {-1, -1, -2, -3}
                };
        System.out.println(countNegatives(arr1));

        int[][] arr2 = new int[][]{
                {3, 2},
                {1, 0}
        };
        System.out.println(countNegatives(arr2));
    }

//    public static int countNegatives(int[][] grid) {
//        int rows = grid.length;
//        int result = 0;
//
//        for (int i = 0; i < rows; i++) {
//            int columns = grid[i].length;
//            for (int j = 0; j < columns; j++) {
//                if(grid[i][j] < 0) {
//                    result++;
//                }
//            }
//        }
//        return result;
//    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                result += cols - col;
                row--;
            } else {
                col++;
            }
        }


        return result;
    }
}
