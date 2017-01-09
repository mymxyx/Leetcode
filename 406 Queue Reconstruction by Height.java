public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        int[][] ret = new int[n][2];
        LinkedList<int[]> list = new LinkedList<int[]>();
        Comparator<int[]> cmp = new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        };
        Arrays.sort(people,cmp);
        for(int[] cur: people){
            list.add(cur[1],cur);
        }
        return list.toArray(new int[n][2]);
        
    }
}
