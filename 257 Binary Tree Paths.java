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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<String>();
        if(root == null){
            return ret;
        }
        else{
            paths(root,String.valueOf(root.val),ret);
        }
        return ret;
    }
    public void paths(TreeNode root,String path,List<String> result){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            result.add(path);
            return;
        }
        if(root.left != null){
            paths(root.left,path+"->"+String.valueOf(root.left.val),result);
        }
        if(root.right!= null){
            paths(root.right,path+"->"+String.valueOf(root.right.val),result);
        }
    }
}
