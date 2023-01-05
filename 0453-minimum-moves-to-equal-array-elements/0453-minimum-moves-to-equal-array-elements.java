class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int no:nums){
            min=Math.min(no,min);
        }
        for(int no:nums){
            ans=ans+(no-min);
        }
        return ans;
    }
}