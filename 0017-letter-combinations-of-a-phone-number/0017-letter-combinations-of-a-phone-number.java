class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits==null || digits.length()==0 || digits=="" )return ans;
        HashMap<Character,String[]>map=new HashMap<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
        
        
        solve(0,ans,map,digits,"");
        return ans;
    }
    
    public void solve(int i, List<String>ans, HashMap<Character,String[]>map, String digits, String temp){
        if(i==digits.length()){
            if(temp!=""){
                ans.add(temp);
            }
            return;
        }
        
       String s[]=map.get(digits.charAt(i));
        for(int j=0;j<s.length;j++){
            solve(i+1,ans,map,digits,temp+s[j]);
        }
    }
}