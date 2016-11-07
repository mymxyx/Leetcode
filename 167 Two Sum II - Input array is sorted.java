public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int index1 = 0;
        int index2 = numbers.length-1;
        while(index1<index2){
            int sum = numbers[index1] + numbers[index2];
            if(sum == target){
                res[0] = index1+1;
                res[1] = index2+1;
                break;
            }
            if(sum<target){
                index1++;
            }
            if(sum>target){
                index2--;
            }
            
        }
        return res;
        
    }
}
