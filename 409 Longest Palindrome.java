public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		int count=0;
		int single=0;
		for(int i=0;i<s.length();i++){
			if(hashmap.containsKey(s.charAt(i))){
				hashmap.put(s.charAt(i), hashmap.get(s.charAt(i))+1);
			}
			else{
				hashmap.put(s.charAt(i),1);
			}
		}
		for(Integer value:hashmap.values()){
			if(value == 1) single++;
			else if(value%2 == 0) count +=value;
			else if(value%2 == 1) {
				count += value-1;
				single++;
			}
		}
		if(single ==0){
			return count;
		}
		else{
			return count+1;
		}
        
    }
}
