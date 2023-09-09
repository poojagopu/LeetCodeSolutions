class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m=name.length();
        int n=typed.length();
        int i=0;
        int j=0;
        while(i<m && j<n){
            char c1 = name.charAt(i);
            char c2= typed.charAt(j);
            if(c1==c2)
            {
                int count1=0;
                while(i<m-1 && name.charAt(i+1)==c1){
                    count1++;
                    i++;
                }
                int count2=0;
                while(j<n-1 && typed.charAt(j+1)==c2){
                    count2++;
                    j++;
                }
                if(count2<count1)
                    return false;
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return i==m && j==n;
    }
}