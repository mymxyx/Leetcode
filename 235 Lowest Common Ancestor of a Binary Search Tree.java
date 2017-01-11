// time limit exceeded

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
 public class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val-p.val)*(root.val-q.val)>0){
            root = (root.val>p.val)?root.left:root.right; 
        }
        return root;
    }
    
}
 */
 /*
public class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p == root || q== root) return root;
        TreeNode ret = null;
        return judge(root,p,q,ret);
        
        
        
    }
    private TreeNode judge(TreeNode root, TreeNode p, TreeNode q, TreeNode ret){
        if(root == null) return null;
        if(helper(root,p) && helper(root,q)) {
            ret = root;
        }
        ret = judge(root.left,p,q,ret)==null?ret: judge(root.left,p,q,ret);
        ret = judge(root.right,p,q,ret)==null?ret:judge(root.right,p,q,ret);
        return ret;
        
    }
    private boolean helper(TreeNode root, TreeNode n){
        if(root==null) return false;
        if(root.val == n.val) return true;
        return helper(root.left,n) || helper(root.right,n);
    }
}
*/
