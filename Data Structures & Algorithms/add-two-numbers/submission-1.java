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
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;

        while(l1!=null && l2!=null)
        {
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp = temp.next;
            int sum = l1.val + l2.val + carry;
            carry = 0;
            if(sum<10)
            {
                newNode.val=sum;
            }
            else{
                carry = 1;
                sum = sum % 10;
                newNode.val=sum;
            }
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null)
        {
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp = temp.next;
            int sum = l1.val + carry;
            carry = 0;
            if(sum<10)
            {
                newNode.val=sum;
            }
            else{
                carry = 1;
                sum = sum % 10;
                newNode.val=sum;
            }
            l1=l1.next;
        }

        while(l2!=null)
        {
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp = temp.next;
            int sum = l2.val + carry;
            carry = 0;
            if(sum<10)
            {
                newNode.val=sum;
            }
            else{
                carry = 1;
                sum = sum % 10;
                newNode.val=sum;
            }
            l2=l2.next;
        }

        if(carry > 0)
        {
            temp.next = new ListNode(1);
        }
        return head.next;   
    }
}
