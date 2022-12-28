class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        int n=arr.length;
        while(!q.isEmpty()){
            int val=q.poll();
            if(arr[val]==0)return true;
            if(arr[val]<0)continue;
            
            if(val+arr[val]<n){
                q.add(val+arr[val]);
            }
            if(val-arr[val]>=0){
                q.add(val-arr[val]);
            }
            
            arr[val]=-arr[val];
            
        }
        return false;
    }
}