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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null){
			return ret;
		}
		q.add(root);
		while(!q.isEmpty()){
			int size = q.size();
			List<Integer> tmp = new LinkedList<Integer>();
			for(int i = 0;i<size;i++){
				TreeNode node = q.poll();
				tmp.add(node.val);
				if(node.left!= null){
					q.add(node.left);
				}
				if(node.right!= null){
					q.add(node.right);
				}
			}
			ret.add(0,tmp);
		}
		
		
		return ret;
        
    }
}
