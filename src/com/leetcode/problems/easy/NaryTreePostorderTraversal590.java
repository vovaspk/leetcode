package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal590 {
    public static void main(String[] args) {
        // Test case 1
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node3 = new Node(3, List.of(node5, node6));
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node root1 = new Node(1, List.of(node3, node2, node4));

        System.out.println(postorder(root1)); // expected [5, 6, 3, 2, 4, 1]

        // Test case 2
        Node n14 = new Node(14);
        Node n11 = new Node(11, List.of(n14));
        Node n7 = new Node(7, List.of(n11));
        Node n6 = new Node(6);
        Node n3 = new Node(3, List.of(n6, n7));

        Node n12 = new Node(12);
        Node n8 = new Node(8, List.of(n12));
        Node n4 = new Node(4, List.of(n8));

        Node n13 = new Node(13);
        Node n9 = new Node(9, List.of(n13));
        Node n10 = new Node(10);
        Node n5_2 = new Node(5, List.of(n9, n10));

        Node n2 = new Node(2);
        Node root2 = new Node(1, List.of(n2, n3, n4, n5_2));

        System.out.println(postorder(root2)); // expected [2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1]
    }

    public static List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }

    private static void traverse(List<Integer> res, Node node) {
        if (node == null) {
            return;
        }

        if (node.children != null) {
            for (Node child : node.children) {
                traverse(res, child);
            }
        }

        res.add(node.val);
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
