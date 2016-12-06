package amazon006;
import java.util.*;

class Node{
	int val;
	Node next;
	Node random;
	public Node(int a){
		this.val = a;
	}
}
public class CopyListWithRandomPointer {
	public static void main(String[] args){
		Node head = new Node(0);
		Node node2 = new Node(1);
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		
		head.next=node2;
		node2.next=node3;
		node3.next = node4;
		node2.random = head;
		node3.random = node4;
		
		Node result = solution(head);
		System.out.println(result.next.random.val);
	}
	public static Node solution(Node head){
		
		Node dummy = new Node(0);
		Node preNode = dummy;
		Node newNode = null;
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		
		while(head!= null){
			if(map.containsKey(head)){
				newNode = map.get(head);
			}
			else{
				newNode = new Node(head.val);
				map.put(head, newNode);
			}
			preNode.next = newNode;
			if(head.random!= null){
			if(map.containsKey(head.random)){
				newNode = map.get(head.random);
				preNode.random = newNode;
			}
			else{
				newNode = new Node(head.random.val);
				preNode.random = newNode;
				map.put(head.random,newNode);
			}
			}
			head = head.next;
			preNode = preNode.next;
		}
		return dummy.next;


/*		Node dummy = new Node(0);
		Node pre = dummy;
		Node newnode = dummy;
		
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		
		while(head!=null){
			if(map.containsKey(head)){
				newnode = map.get(head);
			}
			else{
				newnode = new Node(head.val);
				map.put(head, newnode);
			}
			pre.next = newnode;
			if(head.random!= null){
				if(map.containsKey(head.random)){
					newnode.random = map.get(head.random);
				}
				else{
					newnode.random = new Node(head.random.val);
					map.put(head.random,newnode.random);
				}
			
			}
			head = head.next;
			pre = newnode;
		}
		
		return dummy.next;
		
		*/
		
	}
	
	
}
