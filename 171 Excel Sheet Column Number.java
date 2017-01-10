public class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        if(s==null || s.length()==0) return ret;
        for(int i = 0;i<s.length();i++){
            ret = ret*26 + (s.charAt(i)-'A'+1);
            
        }
        return ret;
    }
}
