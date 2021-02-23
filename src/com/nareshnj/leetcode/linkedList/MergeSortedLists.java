package com.nareshnj.leetcode.linkedList;

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(29);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(20);

        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " --> ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        if(l1.val > l2.val) {
            result = l2;
            l2 = l2.next;
        } else {
            result = l1;
            l1 = l1.next;
        }

        ListNode tmp = result;
        while (l1 != null || l2 !=null) {

            if(l1 == null) {
                result.next = l2;
                break;
            }
            if(l2 == null) {
                result.next = l1;
                break;
            }

            if(l1.val < l2.val) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;

        }
        return tmp;
    }
}
