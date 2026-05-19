package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidAnagram242 {
    public static void main(String[] args) {
        //System.out.println(isAnagram("anagram", "nagaram"));
        //System.out.println(isAnagram("car", "rat"));
        //System.out.println(isAnagram("aacc", "ccac"));
        System.out.println(isAnagram("aabbbb", "aaaabb"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            var letter = s.charAt(i);
            if (letters.containsKey(letter)) {
                int count = letters.get(letter) + 1;
                letters.put(letter, count);
            } else {
                letters.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            var letter = t.charAt(i);
            if (letters.containsKey(letter)) {
                int count = letters.get(letter);
                if (count > 1) {
                    letters.put(letter, count - 1);
                } else {
                    letters.remove(letter);

                }
            }
        }

        return letters.isEmpty();


    }
}
