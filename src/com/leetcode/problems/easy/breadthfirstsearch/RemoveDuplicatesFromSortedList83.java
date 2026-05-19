package com.leetcode.problems.easy.breadthfirstsearch;

public class RemoveDuplicatesFromSortedList83 {
    public static void main(String[] args) {
        ListNode listNode = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        ListNode curr = listNode;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
//1,1,2 - 1,2
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if(curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }

        }


        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
