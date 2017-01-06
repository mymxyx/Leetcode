//it is very easy to come up with a solution with run time O(n*sizeOf(Integer)), let's do it in linear O(n)
// Space complexity should bo O(n)
// We make use of what we have produced already
// Divide the numbers in ranges like [2-3] [4-7] [8-15] and so on
// And generate new range from previous

public class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        ret[0] = 0;
        if(num == 0) return ret;
        ret[1] = 1;
        int index = 2;
        while(index*2-1<=num){
            Double(ret,index);
            index = index*2;
        }
        for(int i =index;i<=num;i++){
            ret[i] = ret[i-index]+1;
        }
        return ret;
        
    }
    public void Double(int[] ret, int index){
        for(int i = 0;i<index;i++){
            ret[index+i] = ret[i]+1;
        }
    }
}
