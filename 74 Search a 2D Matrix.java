public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int colomn = matrix[0].length;
		int rows = matrix.length;
		int i = rows-1;
		int j = colomn -1;
		while(i>=0 && j>=0){
		    if(matrix[i][j] == target) return true;
		    else if(i>0 && matrix[i-1][j] >= target) i--;
		    else{j--;}
		}
        return false;
    }
}
