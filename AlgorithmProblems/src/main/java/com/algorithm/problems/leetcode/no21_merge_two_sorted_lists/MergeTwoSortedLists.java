package com.algorithm.problems.leetcode.no21_merge_two_sorted_lists;


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode result = resultHead;
        ListNode c1 = l1;
        ListNode c2 = l2;

        while (c1 != null && c2 != null) {
            if(c1.val < c2.val) {
                result.next = new ListNode(c1.val);
                c1 = c1.next;
            } else {
                result.next = new ListNode(c2.val);
                c2 = c2.next;
            }
            result = result.next;
        }

        while (c1 != null) {
            result.next = new ListNode(c1.val);
            c1 = c1.next;
            result = result.next;
        }

        while (c2 != null) {
            result.next = new ListNode(c2.val);
            c2 = c2.next;
            result = result.next;
        }

        return resultHead.next;
    }
}
