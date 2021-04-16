import java.util.List;

public class n21 {
    public static void main(String[] args) {
       
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode p1 = l1.val <= l2.val?l1:l2;
        ListNode p2 = l1.val > l2.val?l1:l2;

        ListNode res = new ListNode(p1.val, null);
        ListNode head = res;
        ListNode temp = null;
        while(p1 != null || p2 != null){
            if(p2.val >= p1.val){
                res.next = new ListNode(p1.val, null);
                res = res.next;
                if(p1.next != null){
                    p1 = p1.next;
                }
                else{
                    res.next = p2;
                    break;
                }
            }
            else{
                temp = p1;
                p1 = p2;
                p2 = temp;
            }
            
        }
        return head.next;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}