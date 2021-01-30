package com.nareshnj.leetcode.array;

public class TargetArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] result = createTargetArray(nums, index);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] prev = new int[1];
        prev[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            int[] tmp = new int[i+1];
            for(int j=0; j< prev.length; j++) {
                tmp[j] = prev[j];
            }
            if(tmp[index[i]] == 0) {
                tmp[index[i]] = nums[i];
            } else {
                for (int j=tmp.length-1; j>= index[i] && j>0; j--) {
                    tmp[j] = tmp[j-1];
                }
                tmp[index[i]] = nums[i];
            }
            prev = tmp;
        }
        return prev;
    }
}
