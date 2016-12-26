public class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int ret = 0;
        int high=0;
        
        //find out the left highest bar of the place
        for(int i = 0;i<len;i++){
            left[i] = high;
            high = max(high,height[i]);

        }
        
        //find out the right highest bar of the place 
        high = 0;
        for(int j = len-1;j>=0;j--){
            right[j] = high;
            high = max(high,height[j]);
        }
        
        // volume = min(leftbar, rightbar)-height
        for(int k = 0;k<len;k++){
            int value =min(left[k],right[k])-height[k];
            if(value>0){
                ret += value;
            }
        }
        return ret;
        
    }
    public int max(int m ,int n){
        if(m>=n){
            return m;
        }
        else return n;
    }
    public int min(int m,int n){
        if(m<=n){
            return m;
        }
        else return n;
    }
}
