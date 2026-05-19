package com.leetcode.problems.easy;

public class ExcelSheetColumnNumber171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("C"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char character = columnTitle.charAt(i);
            int val = character - 'A' + 1;
            result = result * 26 + val;
        }

        return result;
    }
}
