package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < numRows + 1; i++) {
            List<Integer> row = new ArrayList<>();// there will be 5 rows
            for (int j = 1; j < i + 1; j++) {
                //first row is just 1 element [1]
                row.add(j);
            }
            res.add(row);//first element always 1
        }
        return res;
    }
}
