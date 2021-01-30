package com.nareshnj.leetcode.string;

import java.util.Arrays;

public class ArrayStringEqual {
    public static void main(String[] args) {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddef"};
        System.out.println(arrayStringsAreEqualNew(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean isEqual = true;
        StringBuilder sb1 = new StringBuilder();
        Arrays.stream(word1).forEach(word -> sb1.append(word));
        StringBuilder sb2 = new StringBuilder();
        Arrays.stream(word2).forEach(word -> sb2.append(word));

        if(sb1.length() == sb2.length()) {
            for(int i=0; i< sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }
        return isEqual;
    }

    public static boolean arrayStringsAreEqualNew(String[] word1, String[] word2) {
        /*
        String[] word1 = {"a", "bbc"};
        String[] word2 = {"ab", "bc"};
        */
        int id1 = 0, id2 =0, iid1 = 0, iid2 = 0;
        while(id1< word1.length && id2 < word2.length) {
            if (word1[id1].charAt(iid1) != word2[id2].charAt(iid2)) {
                return false;
            }
            iid1 = (++iid1) % word1[id1].length();
            iid2 = (++iid2) % word2[id2].length();

            if(iid1 == 0) {
                id1++;
            }
            if(iid2 == 0) {
                id2++;
            }
        }
        return id1 == word1.length && id2 == word2.length;
    }


}
