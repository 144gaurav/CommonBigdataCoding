package com.java.datastructure.leetcode;

public class Add2NumbersLinkedList {
    public static void main(String[] args) {
        String str = "";
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next = l1;
        ListNode next1 = l2;
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        int sum = 0;
        while(next!=null || next1!=null ||carry ==1){
            int val1 = next != null ? next.val : 0;
            int val2 = next1 != null ? next1.val : 0;
            sum = val1 + val2 + carry;
            if(sum >= 10){
                sum = sum -10;
                carry = 1;
            }else{
                carry = 0 ;
            }

            ListNode newNode = new ListNode(sum,null);
            if(head==null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            sum = 0;
            if(next != null){
                next = next.next;
            }
            if(next1 != null){
                next1 = next1.next;
            }

        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * Example 2:
     *
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * Example 3:
     *
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     *
     *
     * Constraints:
     *
     * The number of nodes in each linked list is in the range [1, 100].
     * 0 <= Node.val <= 9
     * It is guaranteed that the list represents a number that does not have leading zeros.
     */

}
