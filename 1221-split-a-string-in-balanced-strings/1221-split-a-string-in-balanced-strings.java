class Solution {
    public int balancedStringSplit(String s) {
        int res=0;
        int r_count=0;
        int l_count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                r_count+=1;
            else
                l_count+=1;
            if(r_count==l_count)
                res++;
        }
        return res;
    }
}