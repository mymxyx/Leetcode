public class Solution {
    public int rob(int[] nums) {
        int max = 0;
		if(nums == null || nums.length == 0){

			return 0;
		}
		int[] maxArray = new int[nums.length];
		if(nums.length == 1){

			max = nums[0];
		}
		else if(nums.length == 2){

			max = Math.max(nums[0], nums[1]);
		}
		else{

			maxArray[0] = nums[0];
			maxArray[1] = nums[1];
			maxArray[2] = nums[2] +nums[0];
			max = Math.max(maxArray[1], maxArray[2]);
			for(int i = 3;i<nums.length;i++){
				maxArray[i] = Math.max(maxArray[i-2], maxArray[i-3])+nums[i];
				max = Math.max(maxArray[i], max);
			}
			
		}
		return max;
        
    }
}
