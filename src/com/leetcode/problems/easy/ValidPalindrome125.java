package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    private static boolean isPalindrome(String s) {
        if(s.isBlank()) {
            return true;
        }
        String temp = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        if(temp.length() == 1) {
            return true;
        }

        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
