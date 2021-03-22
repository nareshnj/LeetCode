package com.nareshnj.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MergeBST {

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.left.right = new TreeNode(4);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(7);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(mergeTrees(t1, t2));
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

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        int val1 = root1 == null ? 0 : root1.val;
        int val2 = root2 == null ? 0 : root2.val;

        TreeNode head = new TreeNode(val1 + val2);
        head.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        head.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);

        return head;
    }
}
