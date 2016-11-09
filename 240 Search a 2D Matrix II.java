public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int colums = matrix.length;
        int rows = matrix[0].length;
        int i = 0;
        int j = rows-1;
        while(i<colums && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
        
    }
}
