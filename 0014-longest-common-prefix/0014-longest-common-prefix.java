class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ans=strs[0].length();
        if(strs[0]==""|| strs[0].length()==0 || strs[0]==null)return "";
        for(int i=1;i<strs.length;i++){
           int j=0;
            if(strs[i]==""|| strs[i].length()==0 || strs[i]==null)return "";
            
                while(j<strs[0].length() && j<strs[i].length() && strs[i].charAt(j)==strs[0].charAt(j)){
                        j++;
                }
                        ans=Math.min(ans,j);
            }
        return strs[0].substring(0,ans);
            
    
        
    }
}