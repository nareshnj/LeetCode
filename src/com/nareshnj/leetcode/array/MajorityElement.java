package com.nareshnj.leetcode.array;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 2, 3, 3, 3, 4, 3, 3, 3, 3, 5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] num) {

        int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;

        }
        return major;
    }
}
