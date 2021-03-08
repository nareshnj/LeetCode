package com.nareshnj.leetcode.tree;

public class RangeSumBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5, new TreeNode(3), new TreeNode(7));
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);

        System.out.println(rangeSumBST(root, 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (low <= root.val && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        } else if (root.val <= high) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val >= low) {
            return rangeSumBST(root.left, low, high);
        }

        return 0;
    }

}
