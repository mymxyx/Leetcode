public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        if(s.length() == 1) return true;
 		int len = s.length();
		int i = 0;
		int j = len-1;
		while(i<=j){
//			System.out.println("===========================");
//			System.out.println("i:"+s.charAt(i)+valid(s.charAt(i)));
//			System.out.println("j:"+s.charAt(j)+valid(s.charAt(j)));
			while(!valid(s.charAt(i)) && i<len-1){
				i++;
			}
			while(!valid(s.charAt(j)) && j>0){
				j--;
			}
			if(valid(s.charAt(i)) && valid(s.charAt(j)) && i<=j){
				if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
					i++;
					j--;
				}
				else{
					return false;
					
				}
			}
		}
		return true;
			
    }
    public static boolean valid(Character c){
		if(Character.isDigit(c)|| Character.isLetter(c)){
			return true;
		}
		else return false;
	}
}
