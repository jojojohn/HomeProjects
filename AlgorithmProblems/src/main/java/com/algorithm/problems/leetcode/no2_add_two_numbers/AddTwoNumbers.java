package com.algorithm.problems.leetcode.no2_add_two_numbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHeader = new ListNode(0);
        ListNode result;
        ListNode c1 = l1;
        ListNode c2 = l2;
        result = resultHeader;
        int balance = 0;
        while (c1 != null || c2 != null) {
            int x = c1 == null ? 0 : c1.val;
            int y = c2 == null ? 0 : c2.val;
            int sum  = x + y + balance;
            result.next = new ListNode(sum % 10);
            balance = sum / 10;
            c1 = c1 == null ? c1 : c1.next;
            c2 = c2 == null ? c2 : c2.next;
            result = result.next;
        }
        if (balance > 0) {
            result.next = new ListNode(balance);
        }
        return resultHeader.next;
    }

}
