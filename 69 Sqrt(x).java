public class Solution {
    public int mySqrt(int x) {
        int root = x;
        while(x>0){
            if(root>46340){
                root = 46340;
            }
            int mul = root * root;
            if(mul>x){
                root--;
            }
            else if(mul <= x){
                break;
            }
        }
        return root;
    }
}
