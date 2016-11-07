public class Solution {
    public void sortColors(int[] nums) {
        int n0 = 0, n1 = 0, n2=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) n0++;
            if(nums[i] == 1) n1++;
            if(nums[i] == 2) n2++;
        }
        int j = 0;
        while(j<n0) nums[j++] = 0;
        while(j<n0+n1) nums[j++] = 1;
        while(j<n0+n1+n2) nums[j++] =2;
        
    }
}
