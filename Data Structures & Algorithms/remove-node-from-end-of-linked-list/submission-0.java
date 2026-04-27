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
        // count the nodes
        public int countNodes(ListNode head)
        {
                int count=0;
                ListNode temp = head;
                while(temp!=null)
                {
                        count++;
                        temp=temp.next;

                }
                return count;
        }

        public ListNode deleteNodes(ListNode head, int n)
        {
                ListNode temp = head;
                for(int i=0;i<n-1;i++)
                {
                        temp=temp.next;
                }

                ListNode temp2=temp.next;
                temp.next=temp.next.next;
                temp2.next = null;

                return head;

        }
        public ListNode removeNthFromEnd(ListNode head, int n) {
                int count = countNodes(head);
                if(n == count)
                {
                        head=head.next;
                        return head;
                }
                return deleteNodes(head, count-n);
        }   
}
