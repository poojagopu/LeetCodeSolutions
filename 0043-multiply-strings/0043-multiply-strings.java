class Solution {
    public String multiply(String nums1, String nums2) {
        if(nums1==null || nums2==null)return null;
        if(nums1.equals("0") || nums2.equals("0"))return "0";
        if(nums1.equals("1"))return nums2;
        if(nums2.equals("1"))return nums1;
        
        int res[]=new int[nums1.length()+nums2.length()];
        for(int i=nums1.length()-1;i>=0;i--){
            for(int j=nums2.length()-1;j>=0;j--){
                int pro=(nums1.charAt(i)-'0')*(nums2.charAt(j)-'0');
                pro=pro+res[i+j+1];
                res[i+j+1]=pro%10;
                res[i+j]=res[i+j]+pro/10;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int num:res){
            if(num==0 && sb.length()==0)continue;
            sb.append(num);
        }
        return sb.toString();
    }
}