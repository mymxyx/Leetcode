public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        String longer;
		String shorter;
		if(num1.length()>num2.length()){
			longer = num1;
			shorter  = num2;
		}
		else{
			longer = num2;
			shorter = num1;
		}
		char[] longstring = longer.toCharArray();
		char[] shortstring = shorter.toCharArray();
		int longlen = longer.length();
		int shortlen = shorter.length();
		int flag = 0;
		for(int i = shortlen-1;i>=0;i--){
			longlen--;
			int temp = longstring[longlen]-'0'+ shortstring[i]-'0' + flag;
			flag = temp/10;
			res.append(temp%10);
		}
		for(int i = longlen-1;i>=0;i--){
			longlen--;
			int temp = longstring[i]-'0'+flag;
			flag = temp/10;
			res.append(temp%10);
		}
		if(flag != 0){
		    res.append(flag);
		}
		String ret = res.reverse().toString();
		return ret;
    }
}
