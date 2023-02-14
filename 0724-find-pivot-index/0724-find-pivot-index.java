class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0||nums==null)return -1;
        int totalSum=0;
        for(int ele:nums){
            totalSum+=ele;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum-nums[i];
            if(leftSum==totalSum)return i;
            leftSum=leftSum+nums[i];
            
        }
        return -1;
    }
}