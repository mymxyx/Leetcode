/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy;
        RandomListNode newnode = pre;
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		
		while(head!=null){
			if(map.containsKey(head)){
				newnode = map.get(head);
			}
			else{
				newnode = new RandomListNode(head.label);
				map.put(head, newnode);
			}
			pre.next = newnode;
			if(head.random!= null){
				if(map.containsKey(head.random)){
					newnode.random = map.get(head.random);
				}
				else{
					newnode.random = new RandomListNode(head.random.label);
					map.put(head.random,newnode.random);
				}
			
			}
			head = head.next;
			pre = newnode;
		}
		
		return dummy.next;
        
    }
}
