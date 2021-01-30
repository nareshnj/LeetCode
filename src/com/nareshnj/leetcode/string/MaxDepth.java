package com.nareshnj.leetcode.string;

public class MaxDepth {
    public static void main(String[] args) {
        String str =  "1+(2*3)/(2-1)";
        System.out.println(maxDepth(str));
        System.out.println("ABC".toLowerCase());
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                depth++;
                if(depth > maxDepth) {
                    maxDepth = depth;
                }
            } else if (s.charAt(i) == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}
