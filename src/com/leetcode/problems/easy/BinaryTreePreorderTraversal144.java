package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        List<Integer> result = preorderTraversal(root);
        System.out.println(result); // Expected: [1, 2, 4, 5, 6, 7, 3, 8, 9]
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        var res = new ArrayList<Integer>();
        if(root != null) {
            res.add(root.val);
            traversal(root.left, res);
            traversal(root.right, res);
        }
        return res;
    }

    private static void traversal(TreeNode root, List<Integer> list) {
        if(root != null) {
            list.add(root.val);
            traversal(root.left, list);
            traversal(root.right, list);
        }
    }



      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

}
