class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans[]=new int[nums.length];
        int end=nums.length-1;
        int i=0;
        while(i<nums.length){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[end]=nums[left]*nums[left];
                left++;
            }else{
                ans[end]=nums[right]*nums[right];
                right--;
            }
            end--;
            i++;
        }
        return ans;
    }
}