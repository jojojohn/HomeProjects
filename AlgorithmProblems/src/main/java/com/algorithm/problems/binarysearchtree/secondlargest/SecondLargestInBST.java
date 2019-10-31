package com.algorithm.problems.binarysearchtree.secondlargest;

public class SecondLargestInBST {


    public int secondLargest(BSTNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Invalid argument");
        }

        BSTNode current  = root;
        int secondLargest = 0;

        while (current != null) {
            if (current.right == null && current.left != null) {
                current = current.left;
                while (current.right != null) {
                    current = current.right;
                }
                return current.value;
            }

            if (current.right != null && current.right.right == null && current.right.left == null) {
                return current.value;
            }
            current = current.right;
        }
        return secondLargest;
    }
}
