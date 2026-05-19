package com.leetcode.problems.easy;

import java.util.*;

public class FinalPricesWithSpecialDiscount1475 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(array)));
    }
//You are given an integer array prices where prices[i] is the price of the ith item in a shop.
//
//There is a special discount for items in the shop.
// If you buy the ith item,
// then you will receive a discount equivalent to prices[j]
// where j is the minimum index such that j > i and prices[j] <= prices[i].
// Otherwise, you will not receive any discount at all.
//
//Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop,
// considering the special discount.

    //Input: prices = [8,4,6,2,3]
    //Output: [4,2,4,2,3]
    public static int[] finalPrices(int[] prices) {
        int[] ans = Arrays.copyOf(prices, prices.length);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            while (!stack.isEmpty() && prices[stack.peek()] >= currentPrice) {
                int idx = stack.pop();
                ans[idx] = ans[idx] -  prices[i];
            }
            stack.push(i);
        }

        return ans;
    }
}
