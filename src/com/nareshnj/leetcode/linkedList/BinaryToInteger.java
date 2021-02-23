package com.nareshnj.leetcode.linkedList;

public class BinaryToInteger {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(1);
        System.out.println(getDecimalValue(l1));
    }

    public static int getDecimalValue(ListNode head) {
        int value = 0;
        int[] integerList = new int[30];
        integerList[0] = 1;

        for(int i=1; i<30; i++) {
            integerList[i] = integerList[i-1] * 2;
        }

        int size =0;
        ListNode tmp = head;
        while (tmp!=null) {
            size++;
            tmp = tmp.next;
        }

        while (size != 0) {
            --size;
            if(head.val == 1) {
                value += integerList[size];
            }
            head = head.next;
        }
        return value;
    }
}
