package com.nareshnj.ds;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        Node node = new Node(78);
        BinarySearchTree bst = new BinarySearchTree(node);

        bst.insertNode(30);
        bst.insertNode(89);
        bst.insertNode(23);
        bst.insertNode(2);
        bst.insertNode(76);
        bst.insertNode(32);
        bst.traversTree();

        System.out.println("--------" + bst.getNodeByKey(23));
    }
}

class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public void traversTree() {
        traversTree(root);
    }

    private void traversTree(Node root) {
        if(root == null) {
            return;
        }
        traversTree(root.left);
        System.out.println(root.getKey());
        traversTree(root.right);
    }

    public void insertNode(int key) {
        insertNode(root, key);
    }

    public Node insertNode(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }

        if(root.getKey() < key) {
            root.right = insertNode(root.right, key);
        } else {
            root.left = insertNode(root.left, key);
        }

        return root;

    }


    public Node getNodeByKey(int key) {
        return getNodeByKey(this.root, key);
    }

    public Node getNodeByKey(Node root, int key) {
        if(root == null) {
            return null;
        }

        if(root.getKey() == key) {
            return root;
        }

        if(root.getKey() < key) {
            return getNodeByKey(root.right, key);
        } else {
            return getNodeByKey(root.left, key);
        }
    }
}

class Node {
    private int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
