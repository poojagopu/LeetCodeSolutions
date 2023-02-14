class Solution {
    public int[] runningSum(int[] nums) {
        int []ans=new int[nums.length];
        if(nums.length==0||nums==null)return new int[0];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}