import java.util.*;

public class Advertise {
	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		int k = 3;
		List<Integer> result = solution(nums,k);
		System.out.println("largest k elements:");
		for(int i : result){
			System.out.println(i);
		}
		
		
	}
	
	public static List<Integer> solution(int[] nums,int k){

		
/* In quicksort, in each iteration, we need to select a pivot
 * and then partition the array into three part:
 * 1 elements smaller then the pivot
 * 2 elements equal to the pivot
 * 3 elements larger than the pivot
 * in this problem, I always select the rightmost element as the pivot
 * In average sense, the problem is reduced to approximately half of
 * its original size, giving the recursion T(n) = 2T(n/2) +O(n) in which
 * O(n) is the time for partition, and the runtion complexity will be O(nlogn)
 * quick sort, then output the k largest one.
 * 
 
 
 	quicksort(nums,0,nums.length-1);
		List<Integer> ret = new ArrayList<Integer>();
		for(int i = nums.length-1;i>nums.length-k-1;i--){
			ret.add(nums[i]);
		}

		return ret;
*/

/*	
 * loop k times, each time find the largest elements.
 * 
 * 
 * 	
		List<Integer> ret = new ArrayList<Integer>();
		
		while(k>0){
			k--;
			int max = 0;
			for(int i = 0;i<nums.length;i++){
				if(nums[i]>nums[max]) max = i;
			}
			ret.add(nums[max]);
			nums[max] = Integer.MIN_VALUE;
		}
		return ret;
*/
		
/*
 * heapsort is not stand on its own, it completely depends on the the definition of a heap.
 *  and the  build heap,heapify and deleteMax operation.	
 *  first, build a maxHeap(), then deleteMax() k times.
 *  
 * One of the property of heap sort is that it is a in-place algorithms, it is only need a 
 * fixed amount of memory beyond what is used to store that data being sorted
 * Deletion, along with comparisons and sub-heaps as we wove down throught the heap
 * and end when we happen to get the leaf position or it can just stop early depends 
 * on the comparison
 * 
 * In java, PriorityQueue can be regard as min heap by default. 
 
  
 
		
		List<Integer> ret = new ArrayList<Integer>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for(int i : nums){
			q.offer(i);
			if(q.size()>k){
				q.poll();
			}
		}
		while(!q.isEmpty()){
			ret.add(q.poll());
		}
		return ret;
		
		*/
		
	
	}
	
	public static void quicksort(int[] nums, int l, int r){
		if(l<r){
			int p = partition(nums,l,r);
			quicksort(nums,l,p-1);
			quicksort(nums,p+1,r);
		}
	}
	
	public static int partition(int[] nums, int l, int r){
		// pivot value
		int pivot = nums[r];
		// the wall to partition elements
		int wall = l-1;
		
		for(int i = l;i<r;i++){
			if(nums[i]<=pivot){
				wall++;
				int temp = nums[wall];
				nums[wall] = nums[i];
				nums[i] = temp;
			}
		}
		int temp = nums[wall+1];
		nums[wall+1]= nums[r];
		nums[r] = temp;
		return wall+1;
		
	}

	
}
