/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// this is the java breadth-first search solution with a queue used. 
// the size of each List in the return List array is determined by number of nodes of each level.
// So we need a data structer to store each nodes in the same layer and then decend the layer of the tree.
// first in first out queue would do a favor.
// time complexity O(n)  space complexity O(n/2)?
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // create a new List array "ret" as the return value.
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        // handles the empty tree case
        if(root == null){
            return ret;
        }
        // FIFO queue
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // first time, put the root into the queue.
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            //get the size of eath layer of the tree
            int size = q.size();
            // get the value of the current tree layer and put the node of the next layer.
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
            //put each layer of the tree into the return List array
            ret.add(level);
        }
        return ret;
        
    }
}
