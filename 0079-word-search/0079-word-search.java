class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,0,i,j)==true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][]board, String word, int idx, int i, int j){
        if(i<0|| i>=board.length||j<0||j>=board[0].length||word.charAt(idx)!=board[i][j])
            return false;
        if(idx==word.length()-1 && word.charAt(idx)==board[i][j])return true;
        char ch=board[i][j];
        board[i][j]='1';
        boolean ans=dfs(board,word,idx+1,i-1,j)|| dfs(board,word,idx+1,i+1,j)|| dfs(board,word,idx+1,i,j-1)||dfs(board,word,idx+1,i,j+1);
        board[i][j]=ch;
        return ans;
        
    }
}