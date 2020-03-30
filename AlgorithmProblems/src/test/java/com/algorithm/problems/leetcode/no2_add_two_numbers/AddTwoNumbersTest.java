package com.algorithm.problems.leetcode.no2_add_two_numbers;

import junit.framework.TestCase;

public class AddTwoNumbersTest extends TestCase {

    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result  = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 7);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 8);

        l1 = new ListNode(0);
        l1.next = new ListNode(1);

        l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers = new AddTwoNumbers();
        result  = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 5);
        assertEquals(result.next.val, 7);
        assertEquals(result.next.next.val, 4);

        l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(6);

        l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers = new AddTwoNumbers();
        result  = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 5);
        assertEquals(result.next.val, 7);
        assertEquals(result.next.next.val, 0);
        assertEquals(result.next.next.next.val, 1);
    }
}