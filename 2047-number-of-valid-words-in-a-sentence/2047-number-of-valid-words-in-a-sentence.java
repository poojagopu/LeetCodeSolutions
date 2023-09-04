class Solution {
    public int countValidWords(String sentence) {
        String words[]=sentence.strip().split("\\s+");
        int res=0;
        for(String word: words){
            if(ValidWord(word))
                res++;
        }
        return res;
    }
    boolean ValidWord(String word){
        int HCount=0; 
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch))return false;
            if(Character.isLowerCase(ch))continue;
            if(ch=='.'||ch==','||ch=='!'){
                if(i!=word.length()-1)return false;
            }
            if(ch=='-'){
                if(++HCount>1)return false;
                if(i==0||i==word.length()-1||!Character.isLowerCase(word.charAt(i-1))|| !Character.isLowerCase(word.charAt(i+1)))return false;
            }
        }
        return true;
    }
}