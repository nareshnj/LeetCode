package com.nareshnj.leetcode.linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(6);
        l1.next.next.next.next = new ListNode(5);

        ListNode result = reverseList(l1);

        while (result!=null) {
            System.out.print(result.val + " --> ");
            result = result.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next;

        while(current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current.next = prev;

        return current;
    }
}
