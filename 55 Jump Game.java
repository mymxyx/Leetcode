public class Solution {
    public boolean canJump(int[] nums) {
        
      if(nums==null || nums.length<=1){
            return true;
        }
		int far = 0;
		for(int i = 0;i<=far && far<nums.length;i++){
			int val = nums[i];
			if(i+val>far){
				far = i+val;
			}
		}
		if(far >= nums.length-1){
			return true;
		}
		
		return false;
        
    }
    
}
