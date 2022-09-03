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
    
    // ----------- ITERATIVE solution ------------
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode prev = null;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    
    
    // ----------- RECURSIVE solution -----------
     public ListNode recReverseList(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        ListNode newHead = head;
        
        if(head.next!= null){
           newHead = recReverseList(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
     }
}
