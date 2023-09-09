class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set= new HashSet<>();
        
        String str="";
        for(int i=0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                str=str+word.charAt(i);
            }else{
                if(str!=""){
                    set.add(RemoveTrailingZeros(str));
                }
                str="";
            }
        }
        if(str!=""){
            set.add(RemoveTrailingZeros(str));
        }
            
        return set.size();
    }
    private String RemoveTrailingZeros(String str){
        int i=0;
        String newStr="";
        while(i<str.length()){
            if(str.charAt(i)=='0')
                i++;
            else
                break;
        }
        newStr=str.substring(i);
        return newStr;
    }
}