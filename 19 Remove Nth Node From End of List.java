/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 import java.util.Vector;
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode slow = new ListNode(0);
        ListNode fast = new ListNode(0);
        ListNode ret = slow;
        slow.next = head;
        fast.next = head;
        int count =0;
        while(fast.next!= null){
            if(count != n){
                fast = fast.next;
                count++;
            }
            else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next=slow.next.next;
        return ret.next;
        
    }
}
