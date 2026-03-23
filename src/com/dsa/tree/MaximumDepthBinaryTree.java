package com.dsa.tree;

public class MaximumDepthBinaryTree {

    public static int maximumDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = maximumDepth(root.left);
        int rightHeight = maximumDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.left.right = new TreeNode(2);
        int maxDepth = maximumDepth(root);
        System.out.println(maxDepth);
    }
}
