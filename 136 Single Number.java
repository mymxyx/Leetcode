public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i=i+2){
            if(nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

/*
public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i =0;i<nums.length;i++){
			if(!hashset.contains(nums[i])){
				hashset.add(nums[i]);
			}
			else{
				hashset.remove(nums[i]);
			}
		}
		Iterator<Integer> itr = hashset.iterator();
        return itr.next();
    }
}
*/
