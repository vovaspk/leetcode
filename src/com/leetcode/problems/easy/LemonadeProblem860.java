package com.leetcode.problems.easy;

public class LemonadeProblem860 {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20})); // true
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 10, 20})); // false
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 5, 20, 20, 5, 5, 20, 5})); // false
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 5, 20, 5, 10, 5, 20})); // true
        System.out.println(lemonadeChange(new int[]{5, 5, 20, 5, 10, 5, 20})); // false

    }

    public static boolean lemonadeChange(int[] bills) {
        int fiveDollar = 0;
        int tenDollar = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveDollar++;
            } else if (bill == 10) {
                if (fiveDollar == 0) {
                    return false;
                }
                fiveDollar--;
                tenDollar++;
            } else { // bill == 20
                if (tenDollar > 0 && fiveDollar > 0) {
                    tenDollar--;
                    fiveDollar--;
                } else if (fiveDollar >= 3) {
                    fiveDollar -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }



}
