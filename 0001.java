package amazon001;
import java.util.*;
class Node{
	double x;
	double y;
	public Node(double a,double b){
		this.x = a;
		this.y = b;
	}
}
class Rectangle{
	Node a;
	Node b;
	public Rectangle(Node a,Node b){
		this.a = a;
		this.b = b;
	}
}
public class RectangleArea {
	
	public static void main(String[] args){
		Node A = new Node(-2,-2);
		Node B = new Node(2,2);
		Node C = new Node(-1,-1);
		Node D = new Node(1,1);
		Rectangle r = new Rectangle(A,B);
		Rectangle l = new Rectangle(C,D);

		Double result = computeArea(r,l);
		System.out.println(result);
	}

	public static Double computeArea(Rectangle r,Rectangle l){
		if(r.a.x == r.b.y || r.a.y == r.b.y){
			return 0.0;
		}
		if(l.a.x == l.b.x || l.b.y == r.b.y){
			return 0.0;
		}
		Double total =Math.abs(r.a.x-r.b.x)*Math.abs(r.a.y-r.b.y) +Math.abs(l.a.x-l.b.x)*Math.abs(l.a.y-l.b.y);
		System.out.println(total);
		Double overlap =( Math.min(Math.max(r.a.x, r.b.x), Math.max(l.a.x, l.b.x))
				        -Math.max(Math.min(r.a.x, r.b.x),Math.min(l.a.x,l.b.x)))
				        *(Math.min(Math.max(r.a.y, r.b.y), Math.max(l.a.y,l.b.y))
				        - Math.max(Math.min(r.a.y, r.b.y), Math.min(l.a.y, l.b.y)));
		System.out.println(overlap);
		Double result = total - overlap;
		return result;
/*		
 * 		int sum = 0
		sum = (C-A)*(D-B) + (G-E)*(H-F);
		System.out.println(sum);
		int overlap = 0;
		if(A>=G || C<=E || B>=H || D<=F){
		}
		else{
			overlap = (Math.min(C,G)-Math.max(A,E))*(Math.min(D,H)-Math.max(B,F));
		}
		return sum-overlap;
		*/

	}
}
