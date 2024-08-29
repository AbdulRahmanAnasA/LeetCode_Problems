class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowid=matrix.length-1;
        int colid=0;
        int n=matrix[0].length;
        while(rowid>=0 && colid < n){
            if(matrix[rowid][colid]==target)
            return true;
            else if(matrix[rowid][colid]>target)
            rowid--;
            else
            colid++;
        }
        return false;

    }
}
