package com.leetcode.problems.easy.breadthfirstsearch;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int up, down, left, right;
        int perimeter = 0;
        int rows = grid.length;
        for (int i = 0; i < rows; i++) {
            int col = grid[i].length;
            for (int j = 0; j < col; j++) {
                int cell = grid[i][j];

                if (cell == 1) {
                    if (i == 0) {
                        up = 0;
                    } else {
                        up = grid[i - 1][j];
                    }

                    if (j == 0) {
                        left = 0;
                    } else {
                        left = grid[i][j - 1];
                    }

                    if (i == rows - 1) {
                        down = 0;
                    } else {
                        down = grid[i + 1][j];
                    }

                    if (j == col - 1) {
                        right = 0;
                    } else {
                        right = grid[i][j + 1];
                    }

                    perimeter += 4 - (up + left + right + down);
                }
            }
        }


        return perimeter;
    }
}
