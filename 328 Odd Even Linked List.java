/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head ==null || head.next == null) return head;
        ListNode ret = head;
        ListNode odd = head;
        ListNode even = head.next;
        while(even!= null && even.next!= null){
            ListNode temp = even.next;
            even.next = temp.next;
            temp.next = odd.next;
            odd.next = temp;
            odd=odd.next;
            even=even.next;
        }
        
        
        return ret;
    }
}
