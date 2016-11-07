public class Solution {
    public String convert(String s, int numRows) {
        String[] ret = new String[numRows];
        int n =0;
        int flag = -1;
        String result = "";
        for(int i = 0; i<numRows;i++){
            ret[i] = "";
        }
        
        for(int i =0;i<s.length();i++){
            ret[n] += s.charAt(i);
            if(n ==0 ||n == numRows-1){
                flag = -flag;
            }
            if(numRows == 1){
                flag = 0;
            }
            
            n += flag;
        }
        
        for(int i =0;i<numRows;i++){
            result += ret[i];
        }
        return result;
    }
}
