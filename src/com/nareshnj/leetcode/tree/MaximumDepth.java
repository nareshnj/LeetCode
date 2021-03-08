package com.nareshnj.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepth {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));

        String s = strings.get(0); // Has compiler-generated cast

        List lst = new ArrayList();
        lst.add(1);
        lst.add("abc");

        List<?> anyList = new ArrayList<>();
        anyList.add(null);

    }



    private static void unsafeAdd(List list, Object o) {

        list.add(o);

    }

    public static int maxDepth(TreeNode root) {
    return 0;
    }



}
