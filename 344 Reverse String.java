public class Solution {
    public String reverseString(String s) {
        StringBuilder res = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		int len = s.length();
		for(int i = 0;i<len;i++){
			stack.push(s.charAt(i));
		}
		for(int i = 0;i<len;i++){
			res.append(stack.pop());
		}
        return res.toString();
    }
}
