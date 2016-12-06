package amazon007;
import java.util.*;

class Node{
	String id;
	Double score;
	public Node(String id, Double score){
		this.id = id;
		this.score = score;
	}
}

public class FiveScores {
	public static void main(String[] args){
		Node a0 = new Node("kayla",40.0);
		Node a1 = new Node("kayla",50.0);
		Node a2 = new Node("kayla",80.0);
		Node a3 = new Node("kayla",90.0);
		Node a4 = new Node("kayla",80.0);
		Node a5 = new Node("kayla",90.0);		
		Node a6 = new Node("kayla",85.0);
		Node b0 = new Node("carol",40.0);
		Node b1 = new Node("carol",50.0);
		Node b2 = new Node("carol",80.0);
		Node b3 = new Node("carol",90.0);
		Node b4 = new Node("carol",80.0);
		Node b5 = new Node("carol",90.0);		
		Node b6 = new Node("carol",85.0);
		
		List<Node> lists = new ArrayList<Node>();
		lists.add(a0);
		lists.add(a1);
		lists.add(a2);
		lists.add(a3);
		lists.add(a4);		
		lists.add(a5);
		lists.add(a6);
		lists.add(b0);
		lists.add(b1);
		lists.add(b2);
		lists.add(b3);
		lists.add(b4);
		lists.add(b5);
		lists.add(b6);
		
		HashMap<String,Double> result = solution(lists);
		
		System.out.println(result.keySet());
		System.out.println(result.values());
		
	}
	public static HashMap<String,Double> solution(List<Node> lists){
		
		Comparator<Node> cmp = new Comparator<Node>(){
			public int compare(Node a,Node b){
				if(a.score<b.score){
					return 1;
				}
				else if(a.score>b.score){
					return -1;
				}
				else{
					return 0;
				}
			}
		};
		HashMap<String,Double> ret = new HashMap<String, Double>();
		
		HashMap<String,ArrayList<Node>> map = new HashMap<String,ArrayList<Node>>();
	    
		HashSet<String> name = new HashSet<String>();
		
		for(int i =0;i<lists.size();i++){
			if(!map.containsKey(lists.get(i).id)){
				name.add(lists.get(i).id);
				ArrayList<Node> newList = new ArrayList<Node>();
				newList.add(lists.get(i));
				map.put(lists.get(i).id,newList);
			}
			else{
				ArrayList<Node> newList = map.get(lists.get(i).id);
				newList.add(lists.get(i));
				map.put(lists.get(i).id,newList);
			}
		}
		
		
		
		ArrayList<Node> tmp = new ArrayList<Node>();
		
		Iterator ite = name.iterator();
		while(ite.hasNext()){
			String id = ite.next().toString();
			tmp = map.get(id);
			Collections.sort(tmp,cmp);
		    Double sum = 0.0;
			for( int i = 0;i<5;i++){
				sum+= tmp.get(i).score;
			}
			System.out.println("sum: "+sum);
			ret.put(id,sum/5);
		}
		
		
		return ret;
		
		
		
		
		/*
		
		Comparator<Node> cmp = new Comparator<Node>(){
			public int compare(Node a, Node b){
				if(a.score>b.score){
					return 1;
				}
				else if(a.score< b.score){
					return -1;
				}
				else{
					return 0;
				}
			}
		};
		HashMap<String,Double> map = new HashMap<String,Double>();
		HashSet<String> ids = new HashSet<String>();
		for(int i = 0;i<lists.size();i++){
			
			if(!ids.contains(lists.get(i).id)){
				ids.add(lists.get(i).id);
			}
		}
		
		Iterator ite = ids.iterator();
		while(ite.hasNext()){
		
			String name = ite.next().toString();
			PriorityQueue<Node> pq = new PriorityQueue<Node>(lists.size(),cmp);
			System.out.println(name);
			for(int j = 0;j<lists.size();j++){
				if(lists.get(j).id.equals(name)){
					pq.add(lists.get(j));
					if(pq.size()>5){
						System.out.println(pq.peek().score);
						pq.poll();
					}
				}
			}
			Double sum = 0.0;
			while(!pq.isEmpty()){
				
				sum += pq.poll().score;
				System.out.println("sum: "+sum);
			}
			System.out.println("finel score:"+ sum/5);
			map.put(name, sum/5);
		}
		return map;
		
		*/
	}
}

