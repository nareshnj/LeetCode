package com.nareshnj.leetcode.linkedList;

public class MiddleNode {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        //l1.next.next.next.next.next = new ListNode(6);
        System.out.println(middleNode(l1).val);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode faster = head;

        while (faster!= null && faster.next != null) {
            faster = faster.next.next;
            head = head.next;
        }

        return head;
    }
}
