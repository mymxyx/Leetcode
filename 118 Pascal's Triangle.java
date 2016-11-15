public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> last = new ArrayList<Integer>();
        for(int i=1;i<=numRows;i++){
            if(i==1){
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                ret.add(list);
                last = list;
            }
            else{
                List<Integer> list = new ArrayList<Integer>();
                int len = last.size();
                int index = 0;
                int prev = 0;
                while(index<len){
                    if(prev == 0){
                        list.add(1);
                        prev = last.get(index);
                    }
                    else{
                        list.add(last.get(index)+prev);
                        prev = last.get(index);
                    }
                    if(index == len-1){
                        list.add(1);
                    }
                    
                    index ++;
                }
                ret.add(list);
                last = list;
            }
        }
        return ret;
        
    }
}
