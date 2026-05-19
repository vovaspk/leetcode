package com.leetcode.problems.easy.kotlin

class KotlinCheckIfNAndItsDoubleExist1346 {
    fun main() {
        val arr = arrayOf(10, 2, 5, 3)
        println(checkIfExist(arr))
    }

    fun checkIfExist(arr: Array<Int>): Boolean {
        val seen = HashSet<Int>()
        for (i in arr) {
            if (seen.contains(2 * i)) return true;
            if (i % 2 == 0 && seen.contains(i / 2)) return true;
            seen.add(i);
        }
        return false;
    }
}