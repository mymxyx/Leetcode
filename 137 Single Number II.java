public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i=i+3){
            if(!helper(nums[i],nums[i+1],nums[i+2])){
                if(nums[i]==nums[i+1]) return nums[i+2];
                else if(nums[i]==nums[i+2]) return nums[i+1];
                else return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    public boolean helper(int i,int j,int k){
        if(i==j && i==k && j==k){
            return true;
        }
        else return false;
    }
}
