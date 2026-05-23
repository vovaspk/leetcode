package com.leetcode.problems.easy;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]()"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if(i == 0 && (curr == ')' || curr == ']' || curr == '}')) {
                return false;
            }
            if(curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if((stack.peek() == '(' && curr == ')') || (stack.peek() == '[' && curr == ']') || (stack.peek() == '{' && curr == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
