package com.nareshnj.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueCodes = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                sb.append(morseCodes[ch -97]);
            }
            uniqueCodes.add(sb.toString());
        }

        return uniqueCodes.size();
    }
}
