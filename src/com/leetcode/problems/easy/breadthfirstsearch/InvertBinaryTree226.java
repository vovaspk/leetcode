package com.leetcode.problems.easy.breadthfirstsearch;

import static com.leetcode.problems.easy.breadthfirstsearch.Utils.*;

public class InvertBinaryTree226 {
    public static void main(String[] args) {
        var left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        var right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        var tree = new TreeNode(4, left, right);

        //var tree = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        TreeNode invertedTree = invertTree(tree);
        System.out.println(invertedTree);
    }

    //The inverse of an empty tree is the empty tree.
    // The inverse of a tree with root r, and subtrees right and left, is a tree with root r,
    // whose right subtree is the inverse of left, and whose left subtree is the inverse of right.
    public static TreeNode invertTree(TreeNode root) {
        TreeNode invertedLeft;
        TreeNode invertedRight;

        //return new TreeNode(root.val, getInverted(root), getInverted(root));
        return getInverted(root);
    }

    private static TreeNode getInverted(TreeNode root) {
        if(root == null) {
            return new TreeNode();
        }

        if(root.left != null && root.right != null) {
            return new TreeNode(root.val, getInverted(root.right), getInverted(root.left));
        }

        var left = root.left;
        var right = root.right;
        var tempTreeNode = left;
        left = right;
        right = tempTreeNode;

        return new TreeNode(root.val, left, right);
    }



}
