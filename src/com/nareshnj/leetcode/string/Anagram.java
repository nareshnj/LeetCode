package com.nareshnj.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "leetcodez";
        String t = "practicez";
        System.out.println(minStepsAscii(s,t));
    }

    public static int minSteps(String s, String t) {
        Map<Character, Integer> letters = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            if(letters.get(ch)!=null) {
                letters.put(ch, letters.get(ch) +1);
            } else {
                letters.put(ch, 1);
            }
        }

        int steps = 0;
        for(int i=0; i< t.length(); i++) {
            Character ch = t.charAt(i);
            Integer count = letters.get(ch);
            if(count!= null && count != 0) {
                letters.put(ch, letters.get(ch) -1);
            } else {
                steps++;
            }
        }
        return steps;
    }

    public static int minStepsAscii(String s, String t) {
        int[] asciiArray = new int[123];

        for(int i=0; i<s.length(); i++) {
            asciiArray[s.charAt(i)]++;
        }

        int steps = 0;
        for(int i=0; i<t.length(); i++) {
            if(asciiArray[t.charAt(i)] == 0) {
                steps++;
            } else {
                asciiArray[t.charAt(i)]--;
            }
        }

        return steps;
    }
}
