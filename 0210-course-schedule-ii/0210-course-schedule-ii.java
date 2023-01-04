class Solution {
    HashMap<Integer,ArrayList<Integer>>adj;
    int deg[];//inward degree
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        deg=new int[numCourses];
        adj=new HashMap<Integer,ArrayList<Integer>>(numCourses);
        for(int i=0;i<n;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            if(!adj.containsKey(b)){
                adj.put(b,new ArrayList<Integer>());
            }
           ArrayList<Integer>list=adj.get(b);
            list.add(a);
           adj.put(b,list);
           deg[a]++;
        }
        
            //for(int j=0;j<adj.size();j++)
            //System.out.println("adj " + adj.get(j));
        
        
        return bfs(numCourses);
           
    }
    
    public int[] bfs(int n){
        Queue<Integer>q=new LinkedList<>();
        int ans[]=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(deg[i]==0)q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            ans[idx++]=curr;
            count=count+1;
            ArrayList<Integer>children=adj.get(curr);
            if(children!=null){
                for(int child:children){
                deg[child]--;
                if(deg[child]==0)q.add(child);
               }
            }
             
        }
        //System.out.println("count " + count );
        if(count!=n){
            return new int[0];
        }else{
            return ans;
        }
    }
}

//1. create adjacency list 
//2. take indegrees of each vertex
//3. push all 0 degree vertices to queue
//4. pop curr from queue and decrease the indgree of children of curr
//5. if any indegree is 0, push to queue
//6. take count for checking degree