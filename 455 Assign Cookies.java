public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        if(g==null || g.length == 0 || s == null || s.length==0) return count;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j = 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        
        return count;
    }
}
