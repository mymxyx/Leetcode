public class Solution {
    public int myAtoi(String str) {
        int result = 0;
        int flag = 1;
        int i=0;
        str = str.trim();
        if(str.length()==0){
            return 0;
        }
     
        
        if(str.charAt(i)=='+'){
            i++;
        }
        else if(str.charAt(i)=='-'){
            flag = -flag;
            i++;
        }
        while(i<str.length()){
            if(str.charAt(i)-'0'>=0 &&str.charAt(i)-'0'<=9){
                if(result >Integer.MAX_VALUE/10){
                    if(flag == 1){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        return Integer.MIN_VALUE;
                    }
                }
                if(result==Integer.MAX_VALUE/10){
                    if(flag == 1){
                        if(str.charAt(i)-'0'>7){
                            return Integer.MAX_VALUE;
                        }
                    }
                    if(flag == -1){
                        if(str.charAt(i)-'0'>8){
                            return Integer.MIN_VALUE;
                        }
                    }
                }
    
                result = result*10 + str.charAt(i)-'0';
         
                i++;
            }
            else break;
        }
        
        if(flag ==-1){
            result = -result;
        }
                
        return result;
    }
}
