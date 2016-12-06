package amazon004;
import java.util.*;


class Point{
	Double x;
	Double y;
	
	public Point(double a,double b){
		this.x = a;
		this.y = b;
	}
/*	
	public double distance(){
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	*/
	public double distance(){
		return Math.sqrt(this.x*this.x+this.y*this.y);
		
	}
}


public class kPoints {
	
	public static void main(String[] args){
		Point p1 = new Point(-1,-1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(-7,-7);
		Point p4 = new Point(9,9);
		Point p5 = new Point(-2,-2);
		ArrayList<Point> citys = new ArrayList<Point>();
		citys.add(p1);
		citys.add(p2);
		citys.add(p3);
		citys.add(p4);
		citys.add(p5);
		Point[] result = new Point[3];
		Comparator<Point> cmp = new Comparator<Point>(){
			public int compare(Point a,Point b){
				if(a.distance()>b.distance()){
					return 1;
				}
				else if(a.distance()<b.distance()){
					return -1;
				}
				else{
					return 0;
				}
			}
		};
		Collections.sort(citys,cmp);
		
		for(int i = 0;i<3;i++){
			result[i] = citys.get(i);
			System.out.println(citys.get(i).x + ","+citys.get(i).y);
		}
		
		
/*		
		//直接Comparator<> name = new Comparator<>(){ public int compare(o1,o2)};
		Comparator<Point> pointCmp = new Comparator<Point>(){
			// a>b return 1 升序
			public int compare(Point a, Point b){
				if(a.distance()>b.distance()){
					return 1;
				}
				else if(a.distance()<b.distance()){
					return -1;
				}
				else{
					return 0;
				}
			}
		};
		
		Point p1 = new Point(-1,-1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(-7,-7);
		Point p4 = new Point(9,9);
		Point p5 = new Point(-2,-2);
		int k = 3;
		
		// define!!!
		PriorityQueue<Point> pq = new PriorityQueue<Point>(6,pointCmp);
		
		Point[] result = new Point[k];
		
		Point origin = new Point(0,0);
		pq.add(origin);
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		pq.add(p4);
		pq.add(p5);
		
		for(int i = 0;i<k;i++){
			result[i] = pq.poll();
		}
		for(int i =0;i<k;i++){
			System.out.println(result[i].x + " , "+result[i].y);
		}
		
		*/
		
	}
	
}
