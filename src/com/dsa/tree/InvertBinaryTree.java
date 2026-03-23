package com.dsa.tree;

import java.util.List;
import java.util.stream.Collectors;

import static com.dsa.tree.LevelOrderTraversal.levelOrder;

public class InvertBinaryTree {

    public static TreeNode invertBinaryTree(TreeNode root) {
        if (root == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return root;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode inverted = invertBinaryTree(root);

        List<List<Integer>> ans = levelOrder(inverted);
        List<Integer> result = ans.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
