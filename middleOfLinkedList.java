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
    public ListNode middleNode(ListNode head) {
        ListNode first_pointer = head;
        ListNode second_pointer = head;
        
        while(second_pointer != null && second_pointer.next != null){
            first_pointer = first_pointer.next;
            second_pointer = second_pointer.next.next;
        }
        return first_pointer;
    }
}
