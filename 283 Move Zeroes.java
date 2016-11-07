public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                if(i==j){
                    i++;
                    j++;
                }
                else{
                    nums[i++] = nums[j];
                    nums[j++] = 0;
                }
            }
            else{
                j++;
            }
        }
    }
}
