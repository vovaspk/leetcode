package com.leetcode.problems.easy;

import java.util.HashSet;

public class DesignHashSet705 {
    public static void main(String[] args) {

    }

    static class MyHashSet {
        private boolean[] map;

        public MyHashSet() {
            map = new boolean[1_000_001];
        }

        public void add(int key) {
            map[key] = true;
        }

        public void remove(int key) {
            map[key] = false;
        }

        public boolean contains(int key) {
            return map[key] == true;
        }
    }
}
