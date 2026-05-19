package com.leetcode.problems.easy;

public class MergeTwoSortedLists21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = mergeTwoLists(l1, l2);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        ListNode pointer1 = list1;//1,2,4
        ListNode pointer2 = list2;//1,3,4

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val <= pointer2.val) {
                curr.next = pointer1;     // attach node
                pointer1 = pointer1.next; // move input pointer
            } else {
                curr.next = pointer2;
                pointer2 = pointer2.next;
            }
            curr = curr.next; // fix: ALWAYS advance output pointer
        }

        // fix: append leftovers
        curr.next = (pointer1 != null) ? pointer1 : pointer2;

        return dummy.next; // fix: return head of merged list
    }


    public static class ListNode {
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
