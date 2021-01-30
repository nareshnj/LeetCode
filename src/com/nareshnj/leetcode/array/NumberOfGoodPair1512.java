package com.nareshnj.leetcode.array;

public class NumberOfGoodPair1512 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int goodPairCount = 0;
        for(int i: nums) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ++goodPairCount;
                }
            }
        }
        return goodPairCount;
    }

}
