public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                int n = nums[i];
                nums[i] = nums[n-1];
                nums[n-1] = n;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                ret.add(j+1);
            }
        }
        return ret;
    }
}
