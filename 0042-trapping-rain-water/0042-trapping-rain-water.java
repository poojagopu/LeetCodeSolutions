class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int ans=0;
        
        while(l<=r){
            if(height[l]<=height[r]){
                if(leftMax<height[l]){
                    leftMax=height[l];
                }else{
                    ans=ans+leftMax-height[l];
                }
                l++;
            }else{
                if(rightMax<height[r]){
                    rightMax=height[r];
                }else{
                    ans=ans+rightMax-height[r];
                }
                r--;
            }
        }
        return ans;
    }
}