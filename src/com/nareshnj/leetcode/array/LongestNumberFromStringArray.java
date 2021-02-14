package com.nareshnj.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given numbers ["12", "9", "98"]. Combine them to form the largest number => [99812]
public class LongestNumberFromStringArray {

    public static void main(String[] args) {
        String[] array = {"12", "9", "98", "70"};
        List<Integer> numberList = new ArrayList<>();

        for(String str : array) {
            for(char ch : str.toCharArray()) {
                numberList.add(Integer.valueOf(String.valueOf(ch)));
            }
        }

        Collections.sort(numberList, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        numberList.forEach(number -> sb.append(number));
        System.out.println(Integer.valueOf(sb.toString()));
    }
}
