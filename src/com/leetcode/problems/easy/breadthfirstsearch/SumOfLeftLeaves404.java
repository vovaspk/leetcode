package com.leetcode.problems.easy.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static com.leetcode.problems.easy.breadthfirstsearch.Utils.*;

public class SumOfLeftLeaves404 {
    public static void main(String[] args) {
        var left = new TreeNode(9, null, null);
        var right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode tree = new TreeNode(3, left, right);
        System.out.println(sumOfLeftLeaves(tree));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        int sum = 0;
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(!isLeaf(current)) {
                if(current.right != null) {
                    queue.add(current.right);
                }

                if(current.left != null) {
                    if(isLeaf(current.left)) {
                        sum+=current.left.val;
                    }
                    queue.add(current.left);
                }
            }

        }
        return sum;
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }


}
