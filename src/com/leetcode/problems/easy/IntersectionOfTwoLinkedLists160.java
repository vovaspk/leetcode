package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoLinkedLists160 {
    public static void main(String[] args) {
        // shared part (same objects!)
        ListNode shared = new ListNode(8, new ListNode(4, new ListNode(5)));

        // list A: 4 -> 1 -> [shared]
        ListNode l1 = new ListNode(4, new ListNode(1, shared));

        // list B: 5 -> 6 -> 1 -> [shared]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(1, shared)));

        ListNode listNode = getIntersectionNode(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        Set<ListNode> visited = new HashSet<>();

        while (pointer1 != null) {
            //add nodes or value from head1 and then go over head2 and check if its visited if yes return, if no return null?
            visited.add(pointer1);
            pointer1 = pointer1.next;
        }

        while(pointer2 != null) {
            if(visited.contains(pointer2)) {
                return pointer2;
            }
            pointer2 = pointer2.next;
        }


        return null;

    }


}


