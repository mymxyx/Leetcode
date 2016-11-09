public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum =0;
        if(nums.length!= 0)
        {
            sum = maxsum = nums[0];
        }
        for(int i =1;i<nums.length;i++)
        {
            if(sum<=0)sum = 0;
            sum += nums[i];
            if(sum> maxsum) maxsum = sum;
        }
        return maxsum;
        
    }
}
