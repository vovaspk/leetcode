package com.leetcode.problems.easy;

public class LinkedListCycle141 {
    public static void main(String[] args) {

    }

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(head.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
