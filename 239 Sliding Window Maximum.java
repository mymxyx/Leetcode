public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int sum = 0;
        int[] result = new int[nums.length-k+1];
        int[] ret = {};
        if(nums.length == 0 ) return ret;
        for(int i = 0;i <nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<k;j++){
                if(nums[i+j]> max){
                    max = nums[i+j];
                }
            }
            result[i] = max;
        }
        return result;
        
    }
}
