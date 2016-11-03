/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        ListNode res = ret;
        
        while(ret.next != null && ret.next.next != null)
        {
            int tmp = ret.next.val;
            ret.next.val = ret.next.next.val;
            ret.next.next.val = tmp;
            ret = ret.next.next;
        }
        return res.next;
        
    }
}