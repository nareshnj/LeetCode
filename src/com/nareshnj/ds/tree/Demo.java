package com.nareshnj.ds.tree;

public class Demo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(15);
        tree.insert(32);

        tree.traverseInorder();
        System.out.println("-----------------");
        System.out.println(tree.get(27));
        System.out.println(tree.get(30));
        System.out.println(tree.get(287));
        System.out.println("-----------------");
        System.out.println("Min is: "+ tree.min());
    }
}
