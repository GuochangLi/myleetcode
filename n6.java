
/*
    @author:lgc
    @data:2021.4.15
    @question:反转链表
    @note:迭代+递归
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class n6 {
    public static void main(String[] args) {
       
    }
 /*    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return head;
    } */
    /* 递归
    public ListNode reverseList(ListNode head){
        recursionreverse(null, head);
        return root;
    }
    ListNode root = null;
    public void recursionreverse(ListNode head, ListNode tail){
        if(tail == null){
            root = head;
            return;
        }
        recursionreverse(tail, tail.next);
        tail.next = head;
        return;
    } */
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }