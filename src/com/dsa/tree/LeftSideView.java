package com.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftSideView {

    public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                TreeNode curr = queue.poll();

                if (size == 1) ans.add(curr.val);

                if (curr.right != null) queue.offer(curr.right);
                if (curr.left != null) queue.offer(curr.left);
                size--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> ans = leftSideView(root);
        System.out.println(ans);;
    }

}
