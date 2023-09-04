class Solution {
    public int mostWordsFound(String[] sentences) {
        int res=0;
        for(int i=0;i<sentences.length;i++){
            String st=sentences[i];
            int ans=1;
            for(int j=0;j<st.length();j++){
                if(st.charAt(j)==' ')
                    ans++;
            }
            res=Math.max(res,ans);
        }
        return res;
    }
}