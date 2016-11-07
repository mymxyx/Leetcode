public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new LinkedList();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            while(i>0 && i<nums.length-1 && nums[i] == nums[i-1] ){
                i++;
            }
            int sum1 = nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum2 = nums[l]+nums[r];
                if(sum1 +sum2 == 0){
                    List<Integer> newlist = new LinkedList();
                    newlist.add(sum1);
                    newlist.add(nums[l]);
                    newlist.add(nums[r]);
                    ret.add(newlist);
                    while(l<r && nums[l] == nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum1+sum2 <0){
                    l++;
                }
                else if(sum1+sum2 > 0){
                    r--;
                }
            }
            
        }
        return ret;
    }
}
