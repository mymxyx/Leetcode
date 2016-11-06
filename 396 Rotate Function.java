public class Solution {
    public int maxRotateFunction(int[] A) {
		int sum = 0;
        int n = A.length;
        int res = 0;
        int temp = 0;
        for(int i =0;i<n;i++){
            sum += A[i];
            temp+= i* A[i];
        }
        res = temp;
        for(int i =1;i<n;i++){
            temp = temp + sum - n* A[n-i];
            res = Math.max(res,temp);
        }
        return res;
        
    }
}
