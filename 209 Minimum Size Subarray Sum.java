public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int ret = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(left<nums.length && right<nums.length){
            while(sum<s && right<nums.length){
                sum += nums[right++];
            }
            while(sum>=s && left<=right){
                ret = Math.min(ret,right-left);
                sum -= nums[left++];
            }
        }
        return ret == Integer.MAX_VALUE? 0:ret;
        
    }
}
