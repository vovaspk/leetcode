package com.leetcode.problems.easy;

public class ReversePrefixOfWord2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));

        String word2 = "xyxzxe";
        char ch2 = 'z';
        System.out.println(reversePrefix(word2, ch2));
    }

    public static String reversePrefix(String word, char ch) {
        int firstOccurrenceIndex = -1;
        String prefix = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                firstOccurrenceIndex = i;
                prefix = word.substring(0, firstOccurrenceIndex + 1);
                break;
            }
        }

        if(firstOccurrenceIndex == -1) {
            return word;
        }

        for (int i = prefix.length() - 1; i > 0; i--) {
            sb.append(prefix.charAt(i));
        }
        return sb + word.substring(firstOccurrenceIndex);
    }
}
