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
    public int sumOfLeftLeaves(TreeNode root) {
        int ret = 0;
		if(root == null){
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();
			if(tmp.left!= null){
				if(tmp.left.left == null && tmp.left.right == null){
					ret += tmp.left.val;
				}
				else{
					q.add(tmp.left);
				}
			}
			if(tmp.right!= null){
				q.add(tmp.right);
			}
	
		}
		return ret;
    }
}
