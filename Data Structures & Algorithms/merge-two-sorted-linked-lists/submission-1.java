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
        ListNode a = list1;
        ListNode b = list2; 
        if(a == null && b == null)
        {
            return null;
        }

        ListNode head = new ListNode();
        ListNode temp = head;
        while(a != null && b != null)
        {
            temp.next = new ListNode(0);
            temp=temp.next;
            if(a.val <= b.val)
            {
                temp.val = a.val;
                a=a.next;
                System.out.println(temp.val);  
            }
            else{
                temp.val = b.val;
                b=b.next;
                System.out.println(temp.val);
            }
        }

        while(a!=null)
        {
            temp.next = new ListNode(0);
            temp=temp.next;
            temp.val = a.val;
            a=a.next;
            System.out.println(temp.val);
        }

        while(b!=null)
        {
            temp.next = new ListNode(0);
            temp=temp.next;
            temp.val = b.val;
            b=b.next;
            System.out.println(temp.val);
        }

        return head.next;
        
    }
}