package com.nareshnj.ds.tree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInorder() {
        if (root != null)
            root.traverseInOrder();
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }
     public TreeNode min() {
        if (root != null) {
            return root.min();
        }
        return null;
    }




}
