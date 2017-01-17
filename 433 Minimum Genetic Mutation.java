public class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int count = 0;
		
		if(start.length() != end.length()) return -1;
		
		Queue<String> q = new LinkedList<String>();		
		int[] flag = new int[bank.length];
		q.add(start);
		int size = 0;
		while(!q.isEmpty()){
			size = q.size();
	        
			for(int i = 0;i<size;i++){
			    String tmp = q.poll();
			    if(tmp.equals(end)) return count;
			    for(int j = 0;j<bank.length;j++){
			        if(mutation(bank[j],tmp)==1 && flag[j]==0){
			            q.add(bank[j]);
			            flag[j] = 1;
			        }
			    }			    
			}
		
			
			count++;
		}
		
		return -1;
    }
    public int mutation(String s1,String s2){
		int count = 0;
		for(int i = 0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				count++;
			}
		}
		return count;
	}
}
