public class Solution {
    public int climbStairs(int n) {
        int[] ways = new int[n];
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            ways[0] = 1;
        }
        else if(n == 2){
            ways[0] =1;
            ways[1] = 2;
        }
        else{
            ways[0] =1;
            ways[1] = 2;
            for(int i = 3;i<=n;i++){
                ways[i-1] = ways[i-2]+ways[i-3];
            }
        }
        return ways[n-1];
        
        
    }
}
