package com.leetcode.problems.easy;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));//58
        System.out.println(romanToInt("MCMXCIV"));//1994
        System.out.println(romanToInt("III"));//3
        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000
    }

    private static int romanToInt(String s) {
        var map = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
        int result = 0;


        //I can be placed before V (5) and X (10) to make 4 and 9.
        //X can be placed before L (50) and C (100) to make 40 and 90.
        //C can be placed before D (500) and M (1000) to make 400 and 900.

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int romanInteger = map.get(String.valueOf(letter));

            if (i + 1 < s.length()) {
                char nextLetter = s.charAt(i + 1);
                int romanIntegerNext = map.get(String.valueOf(nextLetter));

                if (romanInteger < romanIntegerNext) {
                    result += romanIntegerNext - romanInteger;
                    i++; // skip the next character because it has been processed
                } else {
                    result += romanInteger;
                }
            } else {
                result += romanInteger;
            }
        }

        return result;
    }
}
