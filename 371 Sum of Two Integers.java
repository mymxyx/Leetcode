// a^b is a+b without carrier
// (a&b) <<1 is the carrier

public class Solution {
    public int getSum(int a, int b) {
        
        return (b==0)?a:getSum(a^b,(a&b)<<1);
    }
}
