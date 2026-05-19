package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RansomNote383 {
    public static void main(String[] args) {
//        String r1 = "a";
//        String m1 = "b";
//        System.out.println(canConstruct(r1,m1));
//
//        String r2 = "aa";
//        String m2 = "ab";
//        System.out.println(canConstruct(r2,m2));

        String r3 = "aa";
        String m3 = "aab";
        System.out.println(canConstruct(r3, m3));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            freq.put(magazine.charAt(i), freq.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            if (freq.containsKey(letter)) {
                Integer letterFreq = freq.get(letter);
                if (letterFreq == 1) {
                    freq.remove(letter);//we used that letter
                } else if (letterFreq > 1) {
                    freq.put(letter, letterFreq - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
