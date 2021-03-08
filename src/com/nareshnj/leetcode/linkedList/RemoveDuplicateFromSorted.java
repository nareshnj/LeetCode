package com.nareshnj.leetcode.linkedList;

public class RemoveDuplicateFromSorted {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(3);
        l1.next.next.next.next.next = new ListNode(3);
        l1.next.next.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(l1);

        while (result != null) {
            System.out.print(result.val + " --> ");
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
