package amazon002;
import java.util.*;
public class WindowSum {
	public static void main(String[] args){
		ArrayList A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		int[] B = {1,2,3,4,5};
		int k = 3;
		ArrayList<Integer> result = Solution(A,k);
		for(Integer d :result){
			System.out.println(d);
		}
	}
	public static ArrayList<Integer> Solution(ArrayList<Integer> lists,int k){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(lists==null || lists.size()==0||lists.size()<k){
			return ret;
		}
	
		
		for(int i = 0;i+k-1<lists.size();i++){
			int sum = 0;
			for(int j = 0;j<k;j++){
				sum += lists.get(i+j);
			}
			ret.add(sum);
			
		}
		return ret;
		
	}
		
		
		
/*		
		List<Integer> ret1 = maxSlidingWindow(A,k);
		int[] ret2 = Solution(B,k);
		
		for(int i = 0;i<ret1.size();i++){
			System.out.println(ret1.get(i));
		}
		System.out.println("");
		for(int i = 0;i<ret2.length;i++){
			System.out.println(ret2[i]);
		}
		*/
		
	}
/*	
	
	public static List<Integer> maxSlidingWindow(List<Integer> A, int k){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(A.size()==0 || A == null) return result;
		for(int i = 0;i+k-1<A.size();i++){
			int sum = 0;
			for(int j = 0;j<k;j++){
				sum += A.get(i+j);
			}
			result.add(i,sum);
		}
		return result;
	}
	
	public static int[] Solution(int[] A, int k){
		if(A == null || A.length<k ||k<=0) return null;
		int[] result = new int[A.length-k+1]; 
		for(int i = 0;i+k-1<A.length;i++){
			int sum = 0;
			for(int j = 0;j<k;j++){
				result[i] += A[i+j];
			}
		}
		return result;
	}
	*/

