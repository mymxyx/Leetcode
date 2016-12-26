/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ret = null;
		if (lists.length==0) return ret;
		if(lists.length ==1) return lists[0];
		int length = lists.length;
		int mid = (length-1)/2;
		ListNode l1 = mergeKlists(lists.subList(0,mid+1));
		ListNode l2 = mergeKlists(lists.subList(mid+1,length));
		mergeTwoLists(l1,l2);
        return ret;
    }
    
   public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode ret = new ListNode(0);
		if(l1==null && l2 ==null) return null;
		
		if(l2 == null) return l1;
		
		if(l1 == null) return l2;
		
		if(l1.val<=l2.val){
			ret.val =l1.val;
			ret.next = mergeTwoLists(l1.next,l2);
		}
		else{
			ret.val = l2.val;
			ret.next = mergeTwoLists(l1,l2.next);
		}
	
		return ret;
	}
}
