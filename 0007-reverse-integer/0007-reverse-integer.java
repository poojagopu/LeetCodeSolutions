class Solution {
    public int reverse(int x) {
         boolean flag=false;
        if(x<0){
            flag=true;
        }
        long ans=0;
        long num=Math.abs(x);
        
        while(num>0){
            ans=ans*10+num%10;
            num=num/10;
        }
        
        if(ans > Integer.MAX_VALUE)return 0;
        
        if(flag==true){
            ans=ans*-1;
        }
        return (int)ans;
    }
}