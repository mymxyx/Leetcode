/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p1 = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode l1 = p1;
        ListNode l2 = p2;
        if(head == null)
        {
            return null;
        }
        while(head!= null)
        {
            if(head.val<x)
            {
                l1.next = head;
                l1 = l1.next;
                head = head.next;
                if(l1 !=null) l1.next = null;
            }
            else
            {
                l2.next = head;
                l2 = l2.next;
                head = head.next;
                if(l2!= null) l2.next = null;
            }
        }
        l1.next = p2.next;
        return p1.next;
        
    }
}
