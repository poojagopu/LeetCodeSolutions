class Solution {
    public int minSwaps(String s) {
        int len=s.length();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb0=new StringBuilder();
        for(int i=0;i<len/2;i++){
            sb0.append("01");
            sb1.append("10");
        }
        if(len%2==1){
            sb0.append("0");
            sb1.append("1");
        }
        int count0=0;
        int count1=0;
        int zeros=0;
        int ones=0;
        
        for(int i=0;i<len;i++){
            if(sb0.charAt(i)!=s.charAt(i)){
                count0++;
            }

            if(sb1.charAt(i)!=s.charAt(i)){
                count1++;
            }
            if(s.charAt(i)=='0')zeros++;
            else ones++;
                
        }
        if(len%2==0){
            if(zeros!=ones)return -1;
        }else{
            if(zeros+1==ones)return count1/2;
            else if(zeros-1==ones)return count0/2;
            else return -1;
        }
        
        return Math.min(count0/2,count1/2);

    }
}