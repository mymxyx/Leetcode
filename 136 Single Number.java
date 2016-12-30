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
