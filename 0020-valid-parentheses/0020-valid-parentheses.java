class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.add(s.charAt(i));
            }
            if(st.isEmpty())return false;
            else if(s.charAt(i)==')'){
                char ch=st.peek();
                if(ch!='(')return false;
                else{st.pop();}
            }
           else if(s.charAt(i)==']'){
                char ch=st.peek();
                if(ch!='[')return false;
                else{st.pop();}
            }
           else if(s.charAt(i)=='}'){
                char ch=st.peek();
                if(ch!='{')return false;
                else{st.pop();}
            }
        }
        
        return st.isEmpty();
        
    }
}