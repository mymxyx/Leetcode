public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int length =A.length;
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                int sum = A[i]+B[j];
                if(hashmap.containsKey(sum)){
                    hashmap.put(sum,hashmap.get(sum)+1);
                }
                else{
                    hashmap.put(sum,1);
                }
                
            }
        }
        
        int count = 0;
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                int sum = C[i]+D[j];
                if(hashmap.containsKey(-sum)){
                    count += hashmap.get(-sum);
                }
            }
        }
        return count;
        
    }
}
