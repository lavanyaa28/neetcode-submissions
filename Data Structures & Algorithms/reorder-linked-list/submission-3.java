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

    public ListNode findMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public ListNode reverseHalf(ListNode head, ListNode mid)
    {
       ListNode temp = mid.next;
       mid.next = null;

       ListNode curr = temp;
       ListNode prev = null;
       ListNode succ = curr.next;

       while(curr!=null)
       {
            succ = curr.next;
            curr.next = prev;
            prev = curr;
            curr=succ;
       }

       return prev;
    }

    public void reorderList(ListNode head) { 

        if(head == null || head.next==null)
        {
            return;
        }

        ListNode mid = findMid(head);
        ListNode head1= head;
        ListNode head2 = reverseHalf(head, mid);
        ListNode rightHead, leftHead;

        while(head1!=null && head2!=null)
        {
            leftHead = head1.next;
            rightHead = head2.next;

            head1.next = head2;
            head2.next=leftHead;
            head1=leftHead;
            head2=rightHead;
        }
    }
    
}
