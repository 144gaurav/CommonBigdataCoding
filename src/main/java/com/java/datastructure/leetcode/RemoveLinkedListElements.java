package com.java.datastructure.leetcode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode list = null;
        ListNode tail = null;

        if (head == null || val == 0) {
            return head;
        }
        while (head != null) {
            if (head.val != val) {

                if (list == null) {
                    list = tail = new ListNode(head.val);
                } else {
                    tail.next = new ListNode(head.val);
                    tail = tail.next;
                }
            }
            head = head.next;
        }
        return list;
    }

}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


