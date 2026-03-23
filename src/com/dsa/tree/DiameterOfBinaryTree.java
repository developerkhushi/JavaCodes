package com.dsa.tree;

public class DiameterOfBinaryTree {

    public static int diameter = 0;

    public static int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(5);

        int diameter = diameterOfBinaryTree(root);
        System.out.println(diameter);
    }
}
