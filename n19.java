public class n19 {
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      Map<Integer, ListNode> nodemap = new HashMap<>();
      int index = 1;
      for(ListNode h = head; h != null; h = h.next, index++){
          nodemap.put(index, h);
      }
      if(nodemap.size() - n == 0){
          head = head.next;
          return head;
      }
      nodemap.get(nodemap.size() - n).next = nodemap.get(nodemap.size() - n + 2);
      return head;
  }
}