package com.leetcode.problems.grokking.algorithms.practice;

import java.util.ArrayList;
import java.util.List;

public class SelectionSortPracticeLatest {
    public static void main(String[] args) {
        List<Integer> unsortedArray =
                new ArrayList<>(List.of(5, 2, 7, 6, 4, 8, 3, 9, 1, 0));
        System.out.println(findSmallestIndex(unsortedArray));
        System.out.println(selectionSort(unsortedArray));
    }

    private static List<Integer> selectionSort(List<Integer> unsortedArray) {
        var coppied = copy(unsortedArray);
        List<Integer> result = new ArrayList<>(unsortedArray.size());
        for (int i = 0; i < unsortedArray.size(); i++) {
            int smallest = findSmallestIndex(coppied);
            result.add(coppied.remove(smallest));
        }
        return result;
    }

    private static int findSmallestIndex(List<Integer> unsortedArray) {
        int smallest = unsortedArray.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < unsortedArray.size(); i++) {
            if(unsortedArray.get(i) < smallest) {
                smallest = unsortedArray.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static List<Integer> copy(List<Integer> list) {
        return new ArrayList<>(list);
    }
}
