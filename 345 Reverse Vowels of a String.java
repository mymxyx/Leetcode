public class Solution {
    public String reverseVowels(String s) {
		StringBuilder res = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		int len = s.length();
		boolean ch[] = new boolean[len];
		Arrays.fill(ch, false);
		
		for(int i = 0;i<len;i++){
			if(isvowel(s.charAt(i))){
				ch[i] = true;
				stack.push(s.charAt(i));
			}
			else{
			}
		}
		
		for(int i = 0;i<len;i++){
			if(ch[i] == true){
				res.append(stack.pop());
			}
			else{
				res.append(s.charAt(i));
			}
		}
		
		return res.toString();
    }
    public static boolean isvowel(char c){
		if(c == 'a' || c== 'o' ||c=='e' ||c=='i' ||c=='u' ||c=='A' ||c=='O' ||c=='E' ||c=='I' ||c=='U'){
			return true;
		}
		else{
			return false;
		}
	}
}
