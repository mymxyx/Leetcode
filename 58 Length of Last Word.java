public class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        int len = words.length;
        if(len<1) return 0;
        int ret = words[len-1].length();
        return ret;
    }
}
