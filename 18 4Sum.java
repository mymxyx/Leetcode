public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new LinkedList();
        int sum =0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-3;i++){
            while(i>0 && i<nums.length-2 && nums[i] == nums[i-1]) i++;
            for(int j =i+1;j<nums.length-2;j++){
                while(j>i+1 && j<nums.length-1 &&nums[j] == nums[j-1]) j++;
                int target_tem = target-nums[i]-nums[j];
                int l=j+1, r = nums.length-1;
                while(l<r){
                
                    sum = nums[l]+nums[r];
                    if(sum == target_tem){
                        List<Integer> a = new LinkedList();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        ret.add(a);
                        while(l<r &&nums[l] == nums[l+1]) l++;
                        while(l<r &&nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    
                    if(sum<target_tem) l++;
                    if(sum>target_tem) r--;
                }
            }
        }
    return ret;
    }
}
