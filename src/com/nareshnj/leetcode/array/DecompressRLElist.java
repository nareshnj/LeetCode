package com.nareshnj.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1, 1,2,3};
        int[] result = decompressRLElist(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for(int i=0; i<nums.length; i += 2) {
            arraySize += nums[i];
        }

        int[] result = new int[arraySize];

        int resultIndex=0;
        for(int i=0; i<nums.length; i += 2){
            for(int j=0; j<nums[i]; j++) {
                result[resultIndex] = nums[i+1];
                resultIndex++;
            }
        }

        return result;
    }
}
