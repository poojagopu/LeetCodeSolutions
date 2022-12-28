class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int idx=0;
        
        while(s<=e){
            if(nums[s]==2){
                swap(nums,s,e);
                e--;
            }
            else if(nums[s]==0){
                swap(nums,idx,s);
                idx++;
                s++;
            }else{
                s++;
            }
        }
    }
    private void swap(int nums[], int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
