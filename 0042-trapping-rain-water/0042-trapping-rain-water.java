class Solution {
    public int trap(int[] height) {
        //bruteforce ->res+= min(leftmaxArray,rightMaxArray)-a[i];
        //optimized-> 2pointer approach 
        int l=0;
        int r=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int ans=0;
        
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>leftMax){
                    leftMax=height[l];
                }else{
                    ans+=leftMax-height[l];
                }
                l++;
            }else{
                if(height[r]>rightMax){
                    rightMax=height[r];
                }else{
                    ans+=rightMax-height[r];
                }
                r--;
            }
            
        }
        return ans;
    }
}