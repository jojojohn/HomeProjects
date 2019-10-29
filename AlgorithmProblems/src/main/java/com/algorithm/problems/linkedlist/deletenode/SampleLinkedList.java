package com.algorithm.problems.linkedlist.deletenode;

public class SampleLinkedList {

    private ListNode head;

    SampleLinkedList(final ListNode head) {
        this.head = head;
    }

    public ListNode deleteNode(int value) {
        ListNode current = head;
        ListNode prev = head;

        if (this.head == null) {
            return null;
        }
        if (current.getValue() == value) {
            this.head = current.getNext();
            return current;
        }

        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
            if (current.getValue() == value) {
                prev.setNext(current.getNext());
                return current;
            }
        }
        return null;
    }
}
