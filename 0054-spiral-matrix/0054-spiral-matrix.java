class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int bottom=n;
        int left=0;
        int right=m;
        
        while(top<bottom && left<right){
            for(int i=left;i<right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<bottom;i++){
                res.add(matrix[i][right-1]);
            }
            right--;
            for(int i=right-1;i>=left && bottom>top;i--){
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i=bottom-1;i>=top && left<right;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    } 
}