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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root == null){
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i<size;i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left!= null){
                    q.offer(node.left);
                }
                if(node.right!= null){
                    q.offer(node.right);
                }
            }
            ret.add(level);
        }
        return ret;
        
    }
}
