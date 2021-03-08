package com.nareshnj.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length -1);
    }

    private static TreeNode helper(int[] nums, int start, int end) {
        if(start > end ) {
            return null;
        }

        int mid = (start + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, 0, mid-1);
        node.right = helper(nums, mid+1, end-1);
        return node;
    }
}
