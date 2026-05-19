package com.leetcode.problems.easy;

import java.util.Arrays;

public class DesignHashMap706 {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(0,1);
        map.put(0,2);
        map.put(1,5);
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        map.remove(0);
        System.out.println(map.get(0));


    }
    static class MyHashMap {
        private int[] buckets;

        public MyHashMap() {
            buckets = new int[1_000_001];
            Arrays.fill(buckets, -1);
        }

        public void put(int key, int value) {
            buckets[key] = value;
        }

        public int get(int key) {
            return buckets[key];
        }

        public void remove(int key) {
            buckets[key] = -1;
        }
    }
}
