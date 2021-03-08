package com.nareshnj.leetcode.linkedList;

public class Palindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(8);
        l1.next.next.next.next = new ListNode(29);
        l1.next.next.next.next.next = new ListNode(1);
        l1.next.next.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(l1));

    }

    public static boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }

        boolean isPalindrome = true;

        ListNode reverse = head;
        ListNode prev = null;
        ListNode next = null;

        while (reverse.next != null) {
            next = reverse.next;
            reverse.next = prev;
            prev = reverse;
            reverse = next;
        }

        reverse.next = prev;

        while (head != null) {
            if(head.val != reverse.val) {
                isPalindrome = false;
                break;
            }
            head = head.next;
            reverse = reverse.next;
        }

        return isPalindrome;
    }
}
