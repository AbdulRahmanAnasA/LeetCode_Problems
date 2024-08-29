class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;//no of rows
        int n=matrix[0].length;//no of coloum;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=(high+low)/2;
            int rowid=mid/n;
            int colid=mid%n;
            if(matrix[rowid][colid]==target)
            return true;
            else if(target>matrix[rowid][colid])
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}
