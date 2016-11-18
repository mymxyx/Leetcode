public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1,-1};
		int length = nums.length;
		if(target<nums[0] || target>nums[length-1]){
			return ret;
		}
		int i = 0;
		while(i<length){
			if(nums[i]<target){
				i++;
			}
			else if(nums[i] == target){
				if(ret[0] == -1){
					ret[0] = i;
					ret[1] = i;
				}
				else{
					ret[1] = i;
				}
				i++;
			}
			else if(nums[i]>target){
				break;
			}
		}
		
		return ret;
        
    }
}
