/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = findmiddle(head);                                 //find mid    if{1,2,3,4,5,6} mid = 3; mid.next=4; 
                                                                         //            if{1,2,3,4,5,6,7} mid =3;mid.next = 4;
        ListNode secondHalfList = reverse(mid.next);                     //reverse second half of list, len(secondHalfList) >= len(firstHalfList)
        mid.next = null;
        
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        
        while(head != null) {
            node.next = head;
            head = head.next;
            node = node.next;
            node.next = secondHalfList;
            secondHalfList = secondHalfList.next;
            node = node.next;
        }
        if(head == null){
            node.next = secondHalfList;
        }
        head = dummy.next;
    }
    
    private ListNode findmiddle(ListNode head){
       ListNode fast = new ListNode(0);
        fast.next =head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        while(fast.next!= null && fast.next.next!= null){
        	
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    private ListNode reverse (ListNode head){
       ListNode ret = new ListNode(0);
	   if(head == null || head.next == null) return head;
	   ret.val = head.val;
	   head = head.next;
	   while(head != null){
	       ListNode temp = new ListNode(head.val);
	       temp.next = ret;
	       ret = temp;
	       head = head.next;
	   }
	   return ret;
    }
}
