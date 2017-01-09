public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for(int i = 0;i<A.length-2;i++){
            int diff = A[i+1] - A[i];
            int k = i;
            while(k+2<A.length && A[k+2]-A[k+1] == diff){
                count++;
                k++;
            }
        }
        return count;
        
    }
}
