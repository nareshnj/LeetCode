package com.nareshnj.leetcode.linkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddNumber {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " --> ");
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;

        int remaining = 0;

        while(l1 != null || l2!= null || remaining !=0) {
            int number = 0;
            if(l1 != null) {
                number = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                number += l2.val;
                l2 = l2.next;
            }

            number += remaining;
            remaining = number/10;
            number = number % 10;

            head.val = number;
            if(l1 != null || l2!= null || remaining !=0) {
                head.next = new ListNode();
                head = head.next;
            }
        }


        return result;
    }
}


