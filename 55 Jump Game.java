public class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums==null || nums.length<=1){
            return true;
        }
		int len = nums.length;
		
		// array to record whether an element has been visited
		boolean[] flag = new boolean[len];
		
		helper(0,nums,flag);
		return flag[len-1];
        
    }
    public static void helper(int index, int[] nums, boolean[] flag){
		int val = nums[index];
		int len = nums.length;
		for(int j = 0;j<=val;j++){
			if(index+j<len){
				if(flag[index+j]==true){
			        continue;
			    }
			    else{
			        flag[index+j] = true;
				    helper(index+j,nums,flag);
			    }
			}
		}
    }
}
