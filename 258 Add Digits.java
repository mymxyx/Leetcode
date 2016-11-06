public class Solution {
    public int addDigits(int num) {
        if(num/10 == 0){
            return num;
        }
        int ret = 0;
        while(num/10 !=0){
            ret = 0;
            while(num!= 0){
                ret += num%10;
                num = num/10;
            }
            num = ret;
        }
        return ret;
    }
}
