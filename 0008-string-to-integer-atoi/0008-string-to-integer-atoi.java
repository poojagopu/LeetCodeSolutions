class Solution {
    public int myAtoi(String s) {
                char ch[]=s.toCharArray();
        int size=0;
        boolean positive=true;
        boolean plusSeen=false,minusSeen=false,isDigit=false;
        
        for(int i=0;i<s.length();i++){
            isDigit=ch[i]-'0'>=0 && ch[i]-'0'<=9;
            if((plusSeen||minusSeen) && !isDigit)break;
            if(ch[i]=='+')plusSeen=true;
            if(ch[i]=='-')minusSeen=true;
            if(size==0 && ch[i]==' '){}
            else if(size==0 && ch[i]=='-'){
                positive=false;
            }
            else if(size==0 && ch[i]!='-' && ch[i]!='+'){
               if(isDigit){
                   ch[size++]=ch[i];
               }
                else break;
            }
            else if(size>0 && isDigit){
                ch[size++]=ch[i];
            }
            else if(size>0 && !isDigit){
                break;
            }
         }
        if(size==0){
            return 0;
        }
         long res=0;
        for(int i=0;i<size;i++){
            res=res*10+(ch[i]-'0');
            if(positive && res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(!positive && -res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        
        if(!positive){
            res=res*-1;
        }
        return (int)(res);
    }
}