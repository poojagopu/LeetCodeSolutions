class Solution {
    public int fib(int n) {
        return func(n);
    }
    
    public int func(int n){
        if(n==0)return 0;
        else if(n==1)return 1;
        else{
           return func(n-1)+func(n-2);
        }
    }
}