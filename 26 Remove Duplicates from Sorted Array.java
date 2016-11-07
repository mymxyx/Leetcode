public class Solution {
    public int removeDuplicates(int[] nums) {
        int ret = 0;
        if(nums.length <2){
            return nums.length;
        }
        int pre = nums[0];
        ret = 1;
        int index = 1;
        for(int i =1;i<nums.length;i++){
            int current = nums[i];
            if(current == pre){
                
            }
            else{
                nums[index++] = current;
                pre = current;
                ret++;
            }
        }
        return ret;
        
    }
}
