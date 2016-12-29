/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //equal nullity donates that this branch is the same
        //this is the base case but also handles being given two empty tree
        if(p == null && q == null){
            return true;
        }
        //unequal nullity donates that this branch aren't the same
        //noetes that we have already ruled out equal nullity above
        else if(p == null || q == null){
            return false;
        }
        //if both nodes have values, check if this two nodes are equal
        // decend to the next layer of the tree, "&&" here allows for any difference to overrule a local equality
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        //if we are here, both nodes have values, and they are unequal, so the trees aren't the same.
        else{
            return false;
        }
    }
 
}
