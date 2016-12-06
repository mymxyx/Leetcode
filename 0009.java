package amazon009;
import java.util.*;

class Connection{
	String city1;
	String city2;
	int cost;
	public Connection(String city1,String city2, int cost){
		this.city1 = city1;
		this.city2 = city2;
		this.cost = cost;
	}
	public void printConnection () {
        System.out.println("{ " + this.city1 + " , " + this.city2 + "} " + this.cost);
	}
}
public class MST {
	
	
	
	public static void main(String[] args){

		 ArrayList<Connection> citys = new ArrayList<Connection>();
         citys.add(new Connection("A","B",6));
         citys.add(new Connection("A","D",1));
         citys.add(new Connection("A","E",5));
         citys.add(new Connection("B","C",3));
         citys.add(new Connection("B","D",5));
         citys.add(new Connection("C","D",6));
         citys.add(new Connection("C","F",6));
         citys.add(new Connection("D","F",4));
         citys.add(new Connection("D","E",5));
         citys.add(new Connection("E","F",2));
         ArrayList<Connection> result = solution(citys);
         for(Connection c: result){
        	 c.printConnection();
         }
	}
	
	public static ArrayList<Connection> solution(ArrayList<Connection> citys){
		ArrayList<Connection> ret = new ArrayList<Connection>();
		if(citys.size()==0 || citys == null){
			return ret;
		}
		
		ArrayList<String> visited = new ArrayList<String>();
		
		while(!citys.isEmpty()){
			Connection temp = findmin(citys,visited);
			if(temp == null){
				break;
			}
			citys.remove(temp);
			visited.add(temp.city1);
			visited.add(temp.city2);
			ret.add(temp);
		}
		
		Comparator<Connection> cmp = new Comparator<Connection>(){
			public int compare(Connection o1, Connection o2){
				if(o1.city1.equals(o2.city1)){
					return o1.city2.compareTo(o2.city2);
				}
				
				return o1.city1.compareTo(o2.city1);
				
			}
		};
		
		ret.sort(cmp);
		
		
		return ret;
	}
	
	public static Connection findmin(ArrayList<Connection> citys,ArrayList<String> visited){
		int min = Integer.MAX_VALUE;
		Connection ret = null;
		for(Connection c : citys){
			if(c.cost<=min){
				if((visited.contains(c.city1) && !visited.contains(c.city2)) || (visited.contains(c.city2)&& !visited.contains(c.city1))){
					min = c.cost;
					ret = c;
				}
				if(visited.isEmpty()){
					min = c.cost;
					ret = c;
				}
			}
		}
		return ret;
	}
	

}
