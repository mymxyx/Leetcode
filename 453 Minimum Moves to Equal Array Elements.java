public class Solution {
    public int minMoves(int[] nums) {
        int move = 0;
        int min = Integer.MAX_VALUE;
       
        if(nums== null || nums.length <2) return move;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++){
            move += nums[i]-min;
        }
        return move;
    }
}
