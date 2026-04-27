
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode a=list1;
        ListNode b=list2;
        if(a==null && b==null)
        {
            return null;
        }
        ListNode head=new ListNode() ;
        ListNode curr=head;

        while(a!=null && b!=null)
        {
            curr.next=new ListNode(0);
            curr=curr.next; 
            if(a.val <= b.val)
            {
                curr.val=a.val;
                a=a.next;
                
            }
            else 
            {
                curr.val=b.val;
                b=b.next;
            }   
        }

        while(a!=null)
        {
            
            curr.next=new ListNode();
            curr=curr.next; 
            curr.val=a.val;
            a=a.next; 
        }

        while(b!=null)
        {
            curr.next=new ListNode();
            curr=curr.next; 
            curr.val=b.val;
            b=b.next;
             
        }

        return head.next;
        
    }
}