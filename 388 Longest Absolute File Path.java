public class Solution {
    public int lengthLongestPath(String input) {
        System.out.println(input);
        HashMap<Integer,String> levels = new HashMap<Integer,String>();
		String[] inputArray = input.split("\n");
		String maxPath = "";
		int level = 0;
		for(String s:inputArray){
		    level = 0;
			while(s.contains("\t")){
				s = s.substring(1);
				level++;
			}
			if(s.contains(".")){
				String tempPath = s;
				for(int i = 0;i<level;i++){
					s = levels.get(i)+"/"+s;
				}
				if(s.length()>maxPath.length()){
					maxPath=s;
				}
			}
			else{
				levels.put(level, s);
			}
		}
		System.out.println(maxPath);
		return maxPath.length();
        
    }
}
