package com.leetcode.problems;

public class PermutationsTest {
    public static void main(String[] args) {
        generatePermutations("abc", "");
    }

    private static void generatePermutations(String str, String prefix) {
        if(str.isEmpty()) {
            System.out.println(prefix);
        }

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            var remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, prefix + character);
        }
    }
}
