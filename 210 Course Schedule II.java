public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int index = numCourses-1;
        int[] premap = new int[numCourses];
        
        for(int i = 0;i<prerequisites.length;i++){
            premap[prerequisites[i][1]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for( int i = 0;i<numCourses;i++){
            if(premap[i] == 0){
                queue.add(i);
                result[index--] = i;
            }
        }
        
        while(!queue.isEmpty()){
            int m = queue.remove();
            for(int i = 0;i<prerequisites.length;i++){
                int n = prerequisites[i][1];
                if(m == prerequisites[i][0]){
                    premap[n]--;
                    if(premap[n]==0){
                        queue.add(n);
                        result[index--] = n;
                    }
                }
            }
        }
        if(index!= -1){
            return new int[0];
        }
        else return result;
    }
}
