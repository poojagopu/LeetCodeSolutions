class Solution {
    public boolean equalFrequency(String word) {
        boolean res=false;
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;           
        }
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']--;   
            if(freqSame(freq))
                return true;
            freq[word.charAt(i)-'a']++; 
        }
        return false;
    }
    boolean freqSame(int freq[]){
        int count=0;
        for(int x: freq){
            if(x==0)continue;
            if(count==0)
                count=x;
            else if(count!=x)
                return false;
        }
        return true;
    }
}