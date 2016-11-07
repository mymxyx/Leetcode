public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ret =0;
        int result = 0;
        int closest_pre = 1000;
        int closest = 1000;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int l = i+1,r = nums.length-1;
            int sum = nums[i]+nums[l]+nums[r];
            if(closest(sum,target)<closest_pre){
                closest_pre = closest(sum,target);
                ret = sum;
            }
            
            while(l<r){
                if(l<r-1 && target -sum >0){
                    l++;
                    while(l<r-1 && nums[l] == nums[l-1]) l++;
                    sum = nums[i]+nums[l]+nums[r];
                }
                if(l<r-1 && target-sum<0){
                    r--;
                    while(l<r-1 && nums[r] == nums[r+1]) r--;
                    sum =nums[i]+nums[l]+nums[r];
                }
                if(closest(sum,target)<closest_pre){
                    closest_pre = closest(sum,target);
                    ret = sum;
                }
                else break;
            }
            
            if(closest>=closest_pre){
                closest=closest_pre;
                result = ret;
                closest_pre = 1000;
            }
            else break;
        }
        return result;
    }
    
    public static int closest(int a, int b){
        if(a>=b) return a-b;
        else return b-a;
    }
}
