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
        if(head==null)
        {
            return null;
        }

        ListNode prec=null;
        ListNode curr=head;
        ListNode succ=curr.next;

        while(succ!=null)
        {
            curr.next=prec;
            prec=curr;
            curr=succ;
            succ=curr.next;
        }

        head=curr;
        head.next=prec;
        return head;
        
    }
}
