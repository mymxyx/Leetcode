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

	public static double count;
	public static double sum;
	public static double ave;
	public static Node result;
	
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
		
		tranversel(root);
		System.out.println("ave: "+ave);
		System.out.println("result node: "+result.val);
		
/*		
		double ave = Integer.MIN_VALUE;
		
		lastresult = null;
		Node so = findmaxave(root,ave);
		System.out.println("so?" + so);
		if(lastresult != null){
			System.out.println("lastresult: "+lastresult.val);
		}
		
		*/
	}	
	public static void tranversel(Node r){
		if(r== null ||r.array.size()==0){
			return;
		}
		count = 0.0;
		sum = 0.0;
		helper(r);
//		System.out.println("sum: "+sum);
//		System.out.println("count:"+count);
		if(ave<sum/count){

			ave = sum/count;
			result = r;
		}
//		System.out.println("ave:"+ave);
		if(r.array.size()!=0){
			for(int i = 0;i<r.array.size();i++){
				tranversel(r.array.get(i));
			}
		}
	}
	
	public static void helper(Node r){
		if(r ==null ){
			return;
		}
		count++;
		sum += r.val;
		if(r.array.size()!=0){
			for(int i = 0;i<r.array.size();i++){
				helper(r.array.get(i));
			}
		}
		
	}

/*	
	public static Node findmaxave(Node root,double ave){
//		System.out.println("in findmaxave: "+root.val);
		
		Node ret = null;
		if(root == null || root.array.size()==0){
			return null;
		}
		sum = 0;
		count = 0;
		helper(root);
		double result = sum/count;
		System.out.println("result: "+result);
		if(result > ave){
			
			ave = result;
			ret = root;
			lastresult = root;
			System.out.println("new ave: "+ave);
			System.out.println("new return: "+root.val);
		}
		if(root.array.size()==0){
		}
		else{
			for(Node n:root.array){
				Node ret2 = findmaxave(n,ave);
				if(ret2 != null);
				ret = ret2; 
				}
		}
		return ret;
	}
	
	public static void helper(Node root){
		count++;
		if(root == null ){
			return ;
		}
		System.out.println("in helper: "+root.val);
		if(root!= null){
			sum += root.val;
			System.out.println("count: "+count);
			System.out.println("sum: "+sum);
		}
		if(root.array.size()!= 0){
			for(Node n :root.array){
				helper(n);
			}
		}
		
		return ;
	}
*/
}
