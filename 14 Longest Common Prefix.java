public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String result = common(strs[0],strs[1]);
        for(int i=1;i<strs.length;i++){
            String s = common(strs[i-1],strs[i]);
            if(s.length()<result.length()){
                result = s;
            }
        }
        return result;
        
    }
    
    public static String common(String s1,String s2){
        if(s1.length()==0||s2.length()==0){
            return "";
        }
        String prefix = "";
        int i = 0;
        while(i<s1.length() && i<s2.length() && s1.substring(0,i+1).equals(s2.substring(0,i+1))){
            prefix = s1.substring(0,i+1);
            i++;
        }
        return prefix;
    }
    
}
