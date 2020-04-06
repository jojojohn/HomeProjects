package com.algorithm.problems.leetcode.no21_merge_two_sorted_lists;

import junit.framework.TestCase;

public class MergeTwoSortedListsTest extends TestCase {

    public void testMergeTwoLists() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(6);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode result = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(3, result.next.val);
        assertEquals(6, result.next.next.next.val);
    }
}