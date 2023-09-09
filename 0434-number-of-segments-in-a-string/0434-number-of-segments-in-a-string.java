class Solution {
    public int countSegments(String s) {
        if(s.trim().equals(""))return 0;
        String str[]=s.trim().split("\\s");
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(""))count++;
        }
            
        return str.length-count;
    }
}