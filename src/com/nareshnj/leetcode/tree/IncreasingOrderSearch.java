package com.nareshnj.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class IncreasingOrderSearch {

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(5);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(2);
        t1.left.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(4);
        t1.right = new TreeNode(6);
        t1.right.right = new TreeNode(8);
        t1.right.right.left = new TreeNode(7);
        t1.right.right.right = new TreeNode(9);


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(increasingBST(t1));
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.remove();
            if (tmp == null) {
                System.out.println(tmp);
            } else {
                System.out.println(tmp.val);
                queue.add(tmp.left);
                queue.add(tmp.right);
            }
        }
    }

    public static TreeNode increasingBST(TreeNode root) {
        if(root == null) {
            return root;
        }
        return increasingBST(root, null);
    }

    private static TreeNode increasingBST(TreeNode root, Object o) {
        return null;
    }
}
