package com.leetcode.problems.easy;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        return Arrays.stream(s.split(" "))
                .filter(str -> !str.isBlank())
                .reduce((first, second) -> second)
                .map(String::length)
                .orElse(0);
    }
}
