/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode ret = new ListNode(-1);
        while(head!= null)
        {
            ListNode node = ret;
            while(node.next!=null && node.next.val<head.val)
            {
                node = node.next;
            }
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }
        return ret.next;
        
    }
}
