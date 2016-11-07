/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode node = head;
        int len = 1;
        while(node.next!= null){
            len++;
            node = node.next;
        }
        node.next = head;
        node = head;
        int n = len-k%len;
        while(n>1){
            n--;
            node = node.next;
        }
        ListNode ret = node.next;
        node.next = null;
        return ret;
    }
}
