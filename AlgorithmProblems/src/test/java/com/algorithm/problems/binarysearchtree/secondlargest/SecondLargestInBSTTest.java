package com.algorithm.problems.binarysearchtree.secondlargest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SecondLargestInBSTTest extends TestCase {

    @Test
    public void testSecondLargestWhenRightRightIsNull() {
        BSTNode root = new BSTNode(20);
        root.left = new BSTNode(10);
        root.right = new BSTNode(50);

        SecondLargestInBST secondLargestInBST = new SecondLargestInBST();
        Assert.assertEquals(secondLargestInBST.secondLargest(root), 20);
    }


    @Test
    public void testSecondLargestWhenRightTree() {
        BSTNode root = new BSTNode(20);
        root.left = new BSTNode(10);
        root.right = new BSTNode(50);
        root.right.left = new BSTNode(30);
        root.right.right = new BSTNode(70);
        SecondLargestInBST secondLargestInBST = new SecondLargestInBST();
        Assert.assertEquals(secondLargestInBST.secondLargest(root), 50);
    }

    @Test
    public void testSecondLargestWhenNotRightNode() {
        BSTNode root = new BSTNode(20);
        root.left = new BSTNode(10);
        root.right = new BSTNode(50);
        root.right.left = new BSTNode(30);
        SecondLargestInBST secondLargestInBST = new SecondLargestInBST();
        Assert.assertEquals(secondLargestInBST.secondLargest(root), 30);
    }
}