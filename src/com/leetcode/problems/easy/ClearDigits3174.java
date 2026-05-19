package com.leetcode.problems.easy;

import java.util.Stack;

public class ClearDigits3174 {
    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));
    }

    public static String clearDigits1(String s) {
        Stack<Character> stack = new Stack<>();
        boolean islastDigit = false;
        // abc - ""
        // cb34 - ""
        for (int i = 0; i < s.length(); i++) {
            while (!stack.isEmpty()) {
                if (Character.isAlphabetic(s.charAt(i)) &&
                                Character.isDigit(stack.peek())) {
                    stack.pop();
                }
            }
            stack.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }


        return sb.reverse().toString();
    }

    public static String clearDigits(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                if (!st.isEmpty()) {
                    st.deleteCharAt(st.length() - 1); // remove closest left letter
                }
                // digit is not kept
            } else {
                st.append(c); // keep letters
            }
        }

        return st.toString();
    }
}
