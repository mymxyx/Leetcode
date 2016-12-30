public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ret = {Integer.MIN_VALUE,Integer.MIN_VALUE};
        int index = 0;
        if(nums.length==2){
            return nums;
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i=i+2){
            if(nums[i]!= nums[i+1]){
                ret[index] = nums[i];
                if(index==1) break;
                index++;
                i--;
            
            }
        }
        if(ret[1]==Integer.MIN_VALUE){
            ret[1] = nums[nums.length-1];
        }
        return ret;
        
    }
}
