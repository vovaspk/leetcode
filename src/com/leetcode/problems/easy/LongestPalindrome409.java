package com.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome409 {
    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        int longest = 0;
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                longest+=2;
                chars.remove(s.charAt(i));
            } else {
                chars.add(s.charAt(i));
            }
        }

        if (!chars.isEmpty()) {

            longest++;

        }

        return longest;
    }

}
