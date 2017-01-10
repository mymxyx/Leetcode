public class NumArray {
    int[] sums = null;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<sums.length;i++){
            sum += nums[i];
            sums[i] = sum;
        }
        
    }

    void update(int i, int val) {
        
        int numi = (0==i)?sums[i]:(sums[i] - sums[i-1]);
        int diff = val-numi;
        if(i<sums.length){
            for(int j = i;j<sums.length;j++){
                sums[j] += diff;
            }
        }
    }

    public int sumRange(int i, int j) {
        return (0==i)?sums[j] : (sums[j]-sums[i-1]);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
