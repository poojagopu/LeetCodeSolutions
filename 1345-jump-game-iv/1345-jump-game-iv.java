class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n==1)return 0;
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        Queue<Integer>q=new LinkedList<>();
        int steps=0;
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                List<Integer>temp=map.get(arr[i]);
                temp.add(i);
                map.put(arr[i],temp);
            }else{
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(arr[i],temp);
            }
        }
        q.add(0);
        while(!q.isEmpty()){
            steps++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int idx=q.poll();
                if(idx-1>=0 && map.containsKey(arr[idx-1])){
                q.add(idx-1);
             }
            if(idx+1<n && map.containsKey(arr[idx+1])){
                if(idx+1==n-1)return steps;
                q.add(idx+1);
            }
            
            if(map.containsKey(arr[idx])){
                List<Integer>temp=map.get(arr[idx]);
                for(int k=0;k<temp.size();k++){
                    if(temp.get(k)!=idx){
                        if(temp.get(k)==n-1)return steps;
                        q.add(temp.get(k));
                    }
                    
                }
            }
            map.remove(arr[idx]);
        }
            }
            
        return steps;
        
    }
}