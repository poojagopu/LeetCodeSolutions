class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>ans=new ArrayList<>();
        int len=num.length-1;
        int carry=0;
        while(len>=0 && k>0){
            int currSum=num[len]+carry+k%10;
            k=k/10;
            carry=0;
            if(currSum>9){
                currSum=currSum%10;
                carry=1;
            }
            len--;
            ans.add(currSum);
        }
        while(len>=0){
            int currSum=num[len]+carry;
            carry=0;
            if(currSum>9){
                currSum=currSum%10;
                carry=1;
            }
            len--;
            ans.add(currSum);
        }
        
        while(k>0){
            int currSum=carry+k%10;
            k=k/10;
            carry=0;
            if(currSum>9){
                currSum=currSum%10;
                carry=1;
            }
            ans.add(currSum); 
        }
        
        if(carry==1){
            ans.add(carry);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}