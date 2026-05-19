package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        AtomicReference<String> result = new AtomicReference<>("");

        for (int i = 0; i <s.length(); i++) {
            char currS = s.charAt(i);
            char currT = t.charAt(i);

            if(map.containsKey(currS) && map.get(currS) != currT) {
                return false;
            }
            map.put(currS, currT);
        }

        return true;
//        map.forEach((key, value) -> result.updateAndGet(v -> v + value));
//        return Objects.equals(result.get(), t);


    }
}
