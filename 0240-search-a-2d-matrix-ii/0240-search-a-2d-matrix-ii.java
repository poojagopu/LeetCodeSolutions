class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;//rows
        int n=matrix[0].length-1;//columns
        
        while(m<matrix.length && n>=0){
            if(matrix[m][n]==target)return true;
            else if(target>=matrix[m][n]){
                m++;
            }else{
                n--;
            }
        }
        return false;
    }
}