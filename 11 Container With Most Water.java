public class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int maxarea = 0;
        
        while(left<right){
            int water = (right-left)*min(height[left],height[right]);
            if(water>maxarea){
                maxarea = water;
            }
            if(height[left]<height[right]){
                ++left;
            }
            else{
                --right;
            }
            
        }
        return maxarea;
        
    }
    
    public static int min(int x, int y){
        if(x<=y){
            return x;
        }
        else{
            return y;
        }
    }
}
