package com.nareshnj.leetcode.numbers;

public class ReduceNumberToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                --num;
            }
            ++steps;
        }
        return steps;
    }
}
