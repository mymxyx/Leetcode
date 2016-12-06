package amazon003;
import java.util.HashMap;
public class longestPalindrome {
	public static void main(String[] args){
		String s = "abccccdd";
		System.out.println(longest(s));
		System.out.println(solution(s));
	}
	public static String solution(String s){
		if(s.length()<=1){
			return s;
		}
		char[] array = s.toCharArray();
		int len = s.length();
		while(len>0){
			for(int i = 0;i+len-1<array.length;i++){
				int l = i;
				int r = i+len-1;
				int flag = 1;
				while(l<r){
					if(array[l] != array[r]){
						flag = 0;
						break;
					}
					l++;
					r--;
				}
				if(flag == 1){
					return s.substring(i,i+len);
				}
			}
			len--;
		}
		return null;
	}
	
	public static int longest(String s){		
		int ret = 0;	
		int count = 0;
		int single = 0;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i = 0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i),1);
			}
		}
		
		for(Integer i: map.values()){
			if(i == 1){
				single++;
			}
			else if(i%2 == 0){
				count += i;
			}
			else{
				count += i-1;
				single++;
			}
		}
		if(single != 0){
			ret = count+1;
		}
		else{
			ret = count;
		}
		return ret;
		
		/*
		int count = 0;
		int single = 0;
		HashMap<Character,Integer> hashmap = new HashMap<Character, Integer>();
		for(int i = 0;i<s.length();i++){
			if(hashmap.containsKey(s.charAt(i))){
				hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1 );
			}
			else{
				hashmap.put(s.charAt(i),1);
			}
		}
		for(Integer num: hashmap.values()){
			if(num == 1){
				single++;
			}
			else if(num%2 == 1){
				count += num-1;
				single++;
			}
			else if(num%2 == 0){
				count+= num;
			}
		}
		if(single != 0){
			return count+1;
		}

		return count;
		*/
	}

}
