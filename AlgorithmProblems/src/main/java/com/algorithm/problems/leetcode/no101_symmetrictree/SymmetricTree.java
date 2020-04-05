package com.algorithm.problems.leetcode.no101_symmetrictree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root.left);
            queue.add(root.right);
            while (!queue.isEmpty()) {
                TreeNode right = queue.poll();
                TreeNode left = queue.poll();
                if (right == null && left == null) {
                    continue;
                } else if((right.val != left.val) || (left == null || right == null)) {
                    return false;
                }
                queue.add(left.right);
                queue.add(right.left);
                queue.add(left.left);
                queue.add(right.right);
            }
        }

        return true;
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root != null) {
           return this.isSymmetricRecursive(root.left, root.right);
        }

        return true;
    }

    public boolean isSymmetricRecursive(final TreeNode left, TreeNode right) {
        if (right == null && left == null) {
            return true;
        }
        if ((right.val != left.val) || (left == null || right == null)) {
            return false;
        }
        return isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
    }
}
