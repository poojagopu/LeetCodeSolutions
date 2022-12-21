class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(ans,0,n,"",n);
        return ans;
    }
    public void solve(List<String>ans, int start, int end, String temp, int actualN){
        if(start==actualN && end==0){
            ans.add(temp);
            return;
        }
        if(end>0){
            solve(ans,start,end-1,temp.concat("("),actualN);
        }
        if(start<actualN-end){
            solve(ans,start+1,end,temp.concat(")"),actualN);
        }
    }
}