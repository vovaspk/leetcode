package com.leetcode.problems.easy.breadthfirstsearch;

public class SameTree100 {
    public static void main(String[] args) {
        var firstTree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var secondTree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(firstTree, secondTree));

        var firstTree2 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        var secondTree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(firstTree2, secondTree2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    private static boolean isSame(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p != null && q != null && p.val == q.val) {
            return isSame(p.left, q.left) && isSame(p.right, q.right);
        }

        return false;

    }


    public static class TreeNode {
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


