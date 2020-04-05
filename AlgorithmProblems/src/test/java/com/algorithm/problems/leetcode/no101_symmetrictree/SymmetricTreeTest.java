package com.algorithm.problems.leetcode.no101_symmetrictree;

import junit.framework.TestCase;

public class SymmetricTreeTest extends TestCase {

    public void testIsSymmetric() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode left_left = new TreeNode(3);
        TreeNode left_right = new TreeNode(4);
        TreeNode right_left = new TreeNode(4);
        TreeNode right_right = new TreeNode(3);
        treeNode.left = left;
        treeNode.right = right;
        left.left = left_left;
        left.right = left_right;
        right.left = right_left;
        right.right = right_right;
        left_left.left = new TreeNode(2);
        left_left.right = new TreeNode(1);
        right_right.left = new TreeNode(1);
        right_right.right = new TreeNode(2);

        SymmetricTree symmetricTree = new SymmetricTree();
        assertTrue(symmetricTree.isSymmetric(treeNode));
        right_right.left = new TreeNode(1);
        right_right.right = new TreeNode(3);
        assertFalse(symmetricTree.isSymmetric(treeNode));
    }

    public void testIsSymmetric1() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode left_left = new TreeNode(3);
        TreeNode left_right = new TreeNode(4);
        TreeNode right_left = new TreeNode(4);
        TreeNode right_right = new TreeNode(3);
        treeNode.left = left;
        treeNode.right = right;
        left.left = left_left;
        left.right = left_right;
        right.left = right_left;
        right.right = right_right;
        left_left.left = new TreeNode(2);
        left_left.right = new TreeNode(1);
        right_right.left = new TreeNode(1);
        right_right.right = new TreeNode(2);

        SymmetricTree symmetricTree = new SymmetricTree();
        assertTrue(symmetricTree.isSymmetric1(treeNode));
        right_right.left = new TreeNode(1);
        right_right.right = new TreeNode(3);
        assertFalse(symmetricTree.isSymmetric1(treeNode));
    }
}