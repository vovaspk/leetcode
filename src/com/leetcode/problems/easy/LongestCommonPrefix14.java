package com.leetcode.problems.easy;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"sd", "sdka", "sdku"}));
    }

//sdka
// dka
// dk
//




    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int idx = 0;
        while(idx < first.length() && idx < last.length()){
            if(first.charAt(idx) == last.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return first.substring(0, idx);
    }
}
