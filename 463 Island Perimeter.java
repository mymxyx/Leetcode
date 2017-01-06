public class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count =0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(grid[i][j]==1){
                    count += 4;
                    if(i>0 && grid[i-1][j] == 1){
                        count -=2;
                    }
                    if(j>0 && grid[i][j-1] == 1){
                        count -=2;
                    }
                }
            }
        }
        return count;
    }
}
