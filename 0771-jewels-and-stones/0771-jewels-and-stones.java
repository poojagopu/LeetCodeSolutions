class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(char ch : stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1)
                res++;
        }
        return res;
    }
}