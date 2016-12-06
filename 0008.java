package amazon008;
import java.util.*;

class Node{
	int val;
	ArrayList<Node> array = new ArrayList<Node>();
	public Node(int val){
		this.val = val;
	}
}
public class MaxSubtree {

	
	public static void main(String[] args){
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(5);
		Node f = new Node(5);
		Node g = new Node(5);
		Node h = new Node(5);
		Node i = new Node(5);
		
		root.array.add(a);
		root.array.add(b);
		root.array.add(c);
		a.array.add(d);
		a.array.add(e);
		b.array.add(f);
		b.array.add(g);
		c.array.add(h);
		c.array.add(i);
		
		Double[] ave = new Double[1];
		ave[0] = 0.0;
		
		Node[] node = new Node[1];
		
		tranversel(root,ave,node);
		
		System.out.println("ave: "+ave[0]);
		System.out.println("result node: "+node[0].val);
		

	}	
	public static void tranversel(Node r,Double[] ave,Node[] node){
		if(r== null ||r.array.size()==0){
			return;
		}
		
		Double ret[] = new Double[2];
		ret[0] = 0.0;
		ret[1] = 0.0;
		
		helper(r,ret);
		
		Double sum = ret[1];
		Double count = ret[0];
		System.out.println("sum: "+sum);
		System.out.println("count:"+count);
		if(ave[0] < sum/count){

			ave[0] = sum/count;
			node[0] = r;
		}

		if(r.array.size()!=0){
			for(int i = 0;i<r.array.size();i++){
				tranversel(r.array.get(i),ave,node);
			}
		}
	}
	
	public static void helper(Node r,Double[] ret){
		if(r ==null ){
			return;
		}
		ret[0] = ret[0]+1;
		ret[1] += r.val;
		if(r.array.size()!=0){
			for(int i = 0;i<r.array.size();i++){
				helper(r.array.get(i),ret);
			}
		}

		
	}

}
