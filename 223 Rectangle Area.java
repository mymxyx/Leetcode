public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = 0;
        sum = (C-A)*(D-B) + (G-E)*(H-F);
        int overlap = 0;
        if(A>= G || C<=E || B>=H || D<=F){
        }
        else{
            overlap = (Math.min(G,C)-Math.max(E,A)) * (Math.min(D,H)-Math.max(B,F)); 
        }
        return sum - overlap;
        
    }
}
