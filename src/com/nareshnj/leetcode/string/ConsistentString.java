package com.nareshnj.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {

    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedSet = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        for (String word : words) {
            boolean isConsistent = true;
            for(int i=0; i<word.length(); i++){
                if(!allowedSet.contains(word.charAt(i))) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }
}
