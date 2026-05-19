package com.leetcode.problems.easy;

import java.util.LinkedList;

public class PathSum112 {
    public static void main(String[] args) {
        var tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(hasPathSum(tree, 5));
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        var tree2 = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(tree2, 22));
    }

//    public static boolean hasPathSum(TreeNode node, int targetSum) {
//        if (node == null) return false;
//        targetSum -= node.val;
//        if(node.left == null && node.right == null) return targetSum == 0;
//        return hasPathSum(node.left, targetSum) || hasPathSum(node.right, targetSum);
//
//
//    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        LinkedList<TreeNode> node_stack = new LinkedList();
        LinkedList<Integer> sum_stack = new LinkedList();
        node_stack.add(root);
        sum_stack.add(sum - root.val);

        TreeNode node;
        int curr_sum;
        while (!node_stack.isEmpty()) {
            node = node_stack.pollLast();
            curr_sum = sum_stack.pollLast();
            if (
                    (node.right == null) && (node.left == null) && (curr_sum == 0)
            ) return true;

            if (node.right != null) {
                node_stack.add(node.right);
                sum_stack.add(curr_sum - node.right.val);
            }
            if (node.left != null) {
                node_stack.add(node.left);
                sum_stack.add(curr_sum - node.left.val);
            }
        }
        return false;

    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
