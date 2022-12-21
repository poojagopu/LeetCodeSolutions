class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)return ans;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            long target=-(long)(nums[i]);
            int front=i+1;
            int back=nums.length-1;
            while(front<back){
                long sum=(long)(nums[front]+nums[back]);
                if(sum>target)back--;
                else if(sum<target)front++;
                else{
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[front]);
                    list.add(nums[back]);
                    ans.add(list);
                
                    while(front<back && nums[front]==list.get(1))front++;
                    while(front<back && nums[back]==list.get(2))back--;
                }
            }
            while(i+1<nums.length && nums[i]==nums[i+1])i++;
        }
        return ans;
    }
}