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
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return null;
        }


        ListNode curr = head;
        ListNode prev = null;
        ListNode succ = curr.next;

        while(succ != null)
        {
            curr.next=prev;
            prev=curr;
            curr=succ;
            succ= succ.next;
        }

        head=curr;
        curr.next=prev;
        return head;
        
    }
}
