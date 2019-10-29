package com.algorithm.problems.linkedlist.deletenode;

import junit.framework.TestCase;
import org.junit.Assert;

public class SampleLinkedListTest extends TestCase {

    public void testDeleteNode() {
        ListNode first  = new ListNode(1);
        first.setNext(new ListNode(2));
        first.getNext().setNext(new ListNode(3));
        first.getNext().getNext().setNext(new ListNode(4));

        SampleLinkedList sampleLinkedList;
        sampleLinkedList = new SampleLinkedList(first);
        Assert.assertEquals(sampleLinkedList.deleteNode(3).getValue(), 3);
        ListNode current  = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}