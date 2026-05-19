package com.leetcode.problems.medium;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = addTwoNumbers(l1, l2);
        while (res != null && res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remembered = 0;
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (l1 != null || l2 != null) {
            int tempRes = remembered;

            if (l1 != null) {
                tempRes += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                tempRes += l2.val;
                l2 = l2.next;
            }

            if (tempRes >= 10) {
                tempRes -= 10;
                remembered = 1;
            } else {
                remembered = 0;
            }

            current.next = new ListNode(tempRes);
            current = current.next;
        }

        if (remembered == 1) {
            current.next = new ListNode(1);
        }

        return dummy.next;//dummy.next is current head so that we don't have to build current head with special care
    }
}
