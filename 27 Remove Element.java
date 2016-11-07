public class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int index=0;
        int i =0;
        while(i<nums.length){
            if(nums[i] != val){
                nums[index++]=nums[i];
            }
            i++;
        }
    
        return index;
        
    }
}
