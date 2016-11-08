public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
		int len1 = a.length();
		int len2 = b.length();
		int flag = 0;
		int i = 0;
		for(;i<len1 && i<len2;i++){
			int sum = a.charAt(len1-1-i)-'0'+b.charAt(len2-1-i) - '0'+flag;
			s.insert(0,sum%2);
			flag = sum/2;
		}
		while(i<len1){
			int sum = a.codePointAt(len1-1-i)-'0' + flag;
			s.insert(0, sum%2);
			flag = sum/2;
			i++;
		}
		while(i<len2){
			int sum = b.charAt(len2-1-i)-'0'+flag;
			s.insert(0, sum%2);
			flag = sum/2;
			i++;
		}
		if(flag ==1){
			s.insert(0, flag);
		}
		return s.toString();
    }
    
}
