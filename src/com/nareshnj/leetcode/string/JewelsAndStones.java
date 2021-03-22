package com.nareshnj.leetcode.string;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aAZz";
        String stones = "aAAbbbbZZz";
        System.out.println(numJewelsInStones(jewels, stones));

        for(int i=0; i<123; i++) {
            System.out.println((char)i);
        }
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] stonesCount = new int[58];
        for(char ch : stones.toCharArray()) {
            stonesCount[ch - 'A']++;
        }

        for(char ch : jewels.toCharArray()) {
            count += stonesCount[ch - 'A'];
        }
        return count;
    }
}
