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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p != null && q != null){
            return isSameNode(p,q);
        }
        else{
            return false;
        }
    }
    public boolean isSameNode(TreeNode p,TreeNode q){
        boolean a = false;
        boolean b = false;
        boolean c = false;
        if(p.val == q.val){
            a = true;
        }
        if(p.left == null && q.left == null){
            b = true;
        }
        else if(p.left != null && q.left != null){
            b = isSameNode(p.left,q.left);
        }
        if(p.right == null && q.right == null){
            c = true;
        }
        else if(p.right != null && q.right != null){
            c = isSameNode(p.right,q.right);
        }
        return a&&b&&c;
    }
}
