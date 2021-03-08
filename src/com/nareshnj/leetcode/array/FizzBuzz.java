package com.nareshnj.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(31));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strList = new ArrayList<>();
        for(int i=1; i<n+1; i++) {
            if(i%15 == 0) {
                strList.add("FizzBuzz");
            } else if (i%5==0) {
                strList.add("Buzz");
            } else if (i%3==0) {
                strList.add("Fizz");
            } else {
                strList.add(String.valueOf(i));
            }
        }

        return strList;

    }
}
