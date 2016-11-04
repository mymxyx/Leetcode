/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head,null);
    }
    
    private TreeNode helper(ListNode start,ListNode end){
        if(start == end){
            return null;
        }
        ListNode fast = start;
        ListNode slow = start;
        while(fast!= end && fast.next!= end){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(start,slow);
        root.right = helper(slow.next,end);
        return root;
    }
    
    
}
