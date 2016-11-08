public class Solution {
    public String countAndSay(int n) {
        int index = 1;
		String ret = "1";
		
		if(n<1) return "";	
		
		while(index<n){
			int len = ret.length();
			StringBuffer nextString = new StringBuffer();
			int i = 0;
			
			while(i<len){
			    int count = 1;
				char prev = ret.charAt(i);
				while(i+1<len && ret.charAt(i+1)==prev){
					count++;
					i++;
				}
				nextString.append(count);
				nextString.append(prev-'0');
				i++;
			}
			ret = nextString.toString();
//			System.out.println("new String:"+ret);
			index++;
		}
//		System.out.println(ret);
        return ret;
    }
}
