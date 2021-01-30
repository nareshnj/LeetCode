package com.nareshnj.leetcode.array;

public class SmallerNumbers {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        //int[] result = smallerNumbersThanCurrent(nums);
        int[] result = smallerNumbersThanCurrentOptimized(nums);
        for(int i: result)
            System.out.println(i);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int tmp = 0;
            for(int j=0; j<nums.length; j++) {
                if(i!=j && nums[i] > nums[j]){
                    tmp++;
                }
                result[i] = tmp;
            }
        }
        return result;
    }

    public static int[] smallerNumbersThanCurrentOptimized(int[] nums) {
        int[] bucket = new int[102];
        for(int i=0; i<nums.length; i++)
            bucket[nums[i]+1]++;

        for(int i=1; i<102; i++)
            bucket[i] += bucket[i-1];

        for(int i=0; i<nums.length; i++)
            nums[i] = bucket[nums[i]];

        return nums;
    }
}
