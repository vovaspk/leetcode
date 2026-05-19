package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsIntoBasketsII3477 {
    //From left to right, place the fruits according to these rules:
    //
    //Each fruit type must be placed in the leftmost available basket
    //with a capacity greater than or equal to the quantity of that fruit type.
    //Each basket can hold only one type of fruit.
    //If a fruit type cannot be placed in any basket, it remains unplaced.
    //Return the number of fruit types that remain unplaced after all possible allocations are made.

    public static void main(String[] args) {
        int[] fruits = new int[]{4,2,5};
        int[] baskets = new int[]{3,5,4};

        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }

//    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
//        int unplaced = 0;
//
//        int fruitIndex = 0;
//        int basketsIndex = 0;
//
//        int[] placedBuskets = new int[baskets.length];
//        for (int i = 0; i < baskets.length; i++) {
//            placedBuskets[i] =  1;//0 placed, 1 unplaced
//        }
//
//        while(fruitIndex < fruits.length && basketsIndex < baskets.length) {
//            if(fruits[fruitIndex] <= baskets[basketsIndex] && placedBuskets[basketsIndex] == 1) {
//                fruitIndex++;
//                placedBuskets[basketsIndex] = 0;
//                basketsIndex = 0;
//            } else if (fruits[fruitIndex] > baskets[basketsIndex] && basketsIndex == baskets.length - 1){
//                unplaced++;
//                break;
//            } else {
//                basketsIndex++;
//            }
//        }
//
//        return unplaced;
//    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;

        int fruitIndex = 0;
        int basketIndex = 0;

        // true = already used
        boolean[] used = new boolean[baskets.length];

        while (fruitIndex < fruits.length) {
            // If we scanned all baskets and found none -> this fruit is unplaced
            if (basketIndex == baskets.length) {
                unplaced++;
                fruitIndex++;        // move to next fruit
                basketIndex = 0;     // restart scan for next fruit
                continue;
            }

            // If this basket is unused and can fit the fruit -> place it
            if (!used[basketIndex] && fruits[fruitIndex] <= baskets[basketIndex]) {
                used[basketIndex] = true;
                fruitIndex++;        // next fruit
                basketIndex = 0;     // restart scan from the leftmost basket
            } else {
                basketIndex++;       // try next basket
            }
        }

        return unplaced;
    }
}
