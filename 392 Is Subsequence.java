public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
		int tp = 0;
		while(sp<s.length() && tp<t.length()){
			char c = s.charAt(sp);
			while(tp<t.length() && c != t.charAt(tp)) {
				tp++;
			}
			sp++;
			tp++;
		}
		if(sp == s.length() && tp <= t.length()){
		    return true;
		}
		return false;
    }
}
