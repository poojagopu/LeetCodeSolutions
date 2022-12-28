class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr=curr+nums[i];
            sum=Math.max(curr,sum);
            if(curr<0)curr=0;
        }
        return sum;
    }
}