class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        if(numRows==0)return ans;
        List<Integer>curr;
        List<Integer>prev=new ArrayList<>();
        prev.add(1);
        ans.add(prev);
        for(int i=1;i<numRows;i++){
            curr=new ArrayList<>();
            for(int j=0;j<=prev.size();j++){
                if(j==0|| j==prev.size()){
                    curr.add(1);
                }else{
                    curr.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(curr);
            prev=curr;
        }
        
        
        return ans;
    }
}