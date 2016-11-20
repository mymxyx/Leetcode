public class NumArray {
    private int[] sums = null;

    public NumArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        this.sums = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            this.sums[i] = sum;
        }
        
    }

    public int sumRange(int i, int j) {
        return (0==i)?(this.sums[j]):(this.sums[j] - this.sums[i-1]);
        
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
