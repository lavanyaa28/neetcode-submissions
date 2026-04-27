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
             // create a new array
                public ListNode arrayForm(ListNode[] lists)
                {
                        // Node[] array = new ListNode[];
                        ArrayList<Integer> array = new ArrayList<>();
                        for(int i=0;i<lists.length;i++)
                        {
                                ListNode n = lists[i];
                                while(n!=null)
                                {
                                        array.add(n.val);
                                        n=n.next;
                                }
                        }
                        // after all the elements are added to the array
                        // sort the array
                        Collections.sort(array);
                        return newLinkedList(array);
                }

                // after sorting the array create a new linked list
                public ListNode newLinkedList(ArrayList<Integer> array)
                {
                        if(array.size()==0)
                        {
                                return null;
                        }
                        ListNode head = new ListNode();
                        ListNode temp = head;
                        for(Integer i : array)
                        {
                                temp.next = new ListNode(i);
                                System.out.println(temp.val);
                                temp=temp.next;
                                
                        }
                        return head.next;
                }
                public ListNode mergeKLists(ListNode[] lists) {
                        if(lists.length==0)
                        {
                                return null;
                        }
                        return arrayForm(lists);
                }
        }