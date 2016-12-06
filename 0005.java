package amazon005;
import java.util.*;
public class OrderDependency {
	public static void main(String[] args){
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		int[] result = findOrder(numCourses,prerequisites);
		
		for(int i:result){
			System.out.println(i);
		}
	}
	
	public static int[] findOrder(int num,int[][] pre){
		int[] ret = new int[num];
		int index = num-1;
		
		int[] premap = new int[num];
		for(int i = 0;i<pre.length;i++){
			premap[pre[i][1]]++;
		}
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0;i<num;i++){
			if(premap[i] == 0){
				q.add(i);
				ret[index--] = i;
			}
		}
		
		while(!q.isEmpty()){
			int m = q.remove();
			for(int i = 0;i<pre.length;i++){
				int n = pre[i][1];
				if(m == pre[i][0]){
					premap[n]--;
					if(premap[n]==0){
						q.add(n);
						ret[index--] = n;
					}
				}
				
			}
		}
		if(index != -1){
			return null;
		}
		return ret;
		
		
	
	}
/*	
	public static int[] findOrder(int numCourses,int[][] prerequisites){
		int[] result = new int[numCourses];
		int index = numCourses-1;
		int[] premap = new int[numCourses];
		
		for(int i = 0;i<prerequisites.length;i++){
			premap[prerequisites[i][1]]++;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// 不是任何课的先觉条件，理应放在结果的尾部
		for(int i = 0;i< numCourses;i++){
			if(premap[i]==0){
				queue.add(i);
				result[index--] = i;
			}
		}
		
		while(!queue.isEmpty()){
			int m = queue.remove();
			for(int i =0;i<prerequisites.length;i++){
				int n = prerequisites[i][1];
				//如果有课是它的先觉条件，则...
				if(m == prerequisites[i][0]){
					premap[n]--;
					if(premap[n] == 0){
						queue.add(n);
						result[index--] = n;
					}
					
				}
			}
		}
		
		if(index==-1){
			return result;
		}
		else{
			return new int[0];
		}

	}
*/
}
