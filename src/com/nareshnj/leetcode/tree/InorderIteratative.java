package com.nareshnj.leetcode.tree;

import java.util.Stack;

public class InorderIteratative {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.inorder();
        System.out.println("---------------");
        tree.preOrder();
    }

}

class BinaryTree {
    TreeNode root;

    public void inorder() {

        TreeNode current = root;

        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.val + ", ");
            current = current.right;
        }

    }

    public void preOrder() {

        TreeNode current = root;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(current);

        while (!stack.isEmpty()) {

            current = stack.pop();
            System.out.print(current.val + ", ");

            if(current.right!=null){
                stack.push(current.right);
            }

            if(current.left!=null) {
                stack.push(current.left);
            }
        }

    }

    public void postOrder() {

        TreeNode current = root;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(current);

        while (!stack.isEmpty()) {

            current = stack.pop();
            System.out.print(current.val + ", ");

            if(current.right!=null){
                stack.push(current.right);
            }

            if(current.left!=null) {
                stack.push(current.left);
            }
        }

    }

}