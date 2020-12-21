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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int goaddone = 0;
         boolean l1end = false;
         boolean l2end = false;
 
         ListNode head = new ListNode();
         ListNode temp = head;
         ListNode li = l1;
         ListNode lj = l2;
         while(true){
             temp.val = (li.val + lj.val + goaddone) % 10;
             goaddone = (li.val + lj.val + goaddone) / 10;
 
             li = li.next;
             lj = lj.next;
 
             if(li == null && lj == null){
                 break;
             }
             else if(li == null && lj != null)//l2 not end
             {
                 while(lj != null){
                     temp.next = new ListNode((lj.val + goaddone) % 10);
                     goaddone = (lj.val + goaddone) / 10;
                     temp = temp.next;
                     lj = lj.next;
                 }
                 break;
             }
             else if(li != null && lj == null){
                 while(li != null){
                     temp.next = new ListNode((li.val + goaddone) % 10);
                     goaddone = (li.val + goaddone) / 10;
                     temp = temp.next;
                     li = li.next;
                 }
                 break;
             }
             else{
                 temp.next = new ListNode();
                 temp = temp.next;
             }
         }
         if(goaddone != 0){
             temp.next = new ListNode(1);
         }
         return head;
     }
 }