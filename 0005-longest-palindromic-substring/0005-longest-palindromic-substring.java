class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
       
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0,k=i;k<dp.length;k++,j++){
                if(i==0){
                    dp[j][k]=true;
                    max=Math.max(max,k-j+1);
                    start=j;
                    end=k;
                }
                else if(i==1){
                    if(s.charAt(j)==s.charAt(k)){
                        dp[j][k]=true;
                        if(k-j+1>max){
                            max=k-j+1;
                            start=j;
                            end=k;
                        }   
                    }else{
                        dp[j][k]=false;
                    }
                }
                else{
                    if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]==true){
                        dp[j][k]=true;
                        if(k-j+1>max){
                            max=k-j+1;
                            start=j;
                            end=k;
                        } 
                    }else{
                        dp[j][k]=false;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}