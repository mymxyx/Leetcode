public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n!=0){
            int k = n/5;
            count += k;
            n = k;
        }
    return count;
    }
}
