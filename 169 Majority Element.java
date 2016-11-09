public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ret = nums[0];
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i =0;i<len;i++){
            if(hashmap.containsKey(nums[i])){
                int count = hashmap.get(nums[i])+1;
                if(count>(len/2)){
                    ret = nums[i];
                }
                hashmap.put(nums[i],count);
            }
            else{
                hashmap.put(nums[i],1);
            }
        }
        return ret;
    }
}
