class Solution {
    public String addBinary(String a, String b) {
        int m=a.length()-1;
        int n=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        
        while(m>=0 && n>=0){
            if(a.charAt(m)=='1' && b.charAt(n)=='1' ){
                if(carry==1)ans.append('1');
                else ans.append('0');
                carry=1;
            }
            else if((a.charAt(m)=='1' && b.charAt(n)=='0') || (a.charAt(m)=='0' && b.charAt(n)=='1')){
                if(carry==1){
                    ans.append('0');
                    carry=1;
                }
                else {
                ans.append('1');
                carry=0;
                }
            }else{
                if(carry==1){
                    ans.append('1');
                    carry=0;   
                }else{
                    ans.append('0');
                }
            }
            
            
            m--;
            n--;
        }
        
        while(m>=0){
            if(a.charAt(m)=='1'){
                if(carry==1){
                    ans.append('0');
                }else{
                    ans.append('1');
                }
            }else{
                if(carry==1){
                    ans.append('1');
                    carry=0;
                }else{
                    ans.append('0');
                }
            }
            m--;
        }
        while(n>=0){
            if(b.charAt(n)=='1'){
                if(carry==1){
                    ans.append('0');
                }else{
                    ans.append('1');
                }
            }else{
                if(carry==1){
                    ans.append('1');
                    carry=0;
                }else{
                    ans.append('0');
                }
            }
            n--;
        }
        
        if(carry==1)ans.append('1');
        
        return ans.reverse().toString();
    }
}