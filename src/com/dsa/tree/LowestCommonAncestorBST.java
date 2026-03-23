package com.dsa.tree;

public class LowestCommonAncestorBST {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
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

        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(8);

        int lca = (lowestCommonAncestor(root, p, q)).val;
        System.out.println(lca);
    }
}
