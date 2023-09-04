class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char ch[] = address.toCharArray();
        for(int i=0;i<address.length();i++)
        {
            if(ch[i]=='.'){
                sb.append('[');
                sb.append(ch[i]);
                sb.append(']');
            }
            else
                sb.append(ch[i]);
        }
        return sb.toString();
    }
}