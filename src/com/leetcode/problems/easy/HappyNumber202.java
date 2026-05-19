package com.leetcode.problems.easy;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
        System.out.println(isHappyNumber(2));


    }

    private static boolean isHappyNumber(int n) {
        boolean isHappy = false;

        String s = String.valueOf(n);
        int temp = 0;

            for (int i = 0; i < s.length(); i++) {
                int num = Integer.valueOf(s.charAt(i) - '0');
                temp += num * num;
                //System.out.println(num);
            }

        while(temp != 1) {
            // add sum of squares of numbers
        }
            if(temp == 1) {
                return true;
            }
        return false;
    }
}
