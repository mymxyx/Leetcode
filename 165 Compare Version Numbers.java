public class Solution {
    public int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
		String s2[] = version2.split("\\.");
		int i = 0;
		for(;i<s1.length && i<s2.length;i++){
			int intval1 = Integer.parseInt(s1[i]);
			int intval2 = Integer.parseInt(s2[i]);
			if(intval1>intval2) {
				return 1;
			}
			if(intval1<intval2){
				return -1;
			}
		}
		if(s1.length>s2.length){
			for(;i<s1.length;i++){
				int intval = Integer.parseInt(s1[i]);
				if(intval != 0){
					return 1;
				}
			}
		}
		else if(s1.length<s2.length){
			for(;i<s2.length;i++){
				int intval = Integer.parseInt(s2[i]);
				if(intval!= 0 ){
					return -1;
				}
			}
		}
		return 0;
        
    }
    

}
