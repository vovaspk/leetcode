package com.leetcode.problems.easy;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;

    }
}
