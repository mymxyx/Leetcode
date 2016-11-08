public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new LinkedList();
        int left =n,right=n;
        String s = "";
        generate(left,right,s,ret);
        return ret;
        
    }
    public static void generate(int left,int right, String s, List<String> ret){
        if(left==0 && right==0){
            ret.add(s);
        }
        if(left>0){
            generate(left-1,right,s+'(',ret);
        }
        if(right>0 && right>left){
            generate(left,right-1,s+')',ret);
        }
    }
}
