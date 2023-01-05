class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count=0;
        HashMap<Integer, List<Integer>>map=new HashMap<>();
         for(int row[]: reservedSeats){
             List<Integer>list;
             if(!map.containsKey(row[0])){
                 list=new ArrayList<>();
             }else{
                 list= map.get(row[0]);
             }
             list.add(row[1]);
             map.put(row[0],list);
         }
        int size=map.size();
        count=(n-size)*2;
        for(List<Integer>list: map.values()){
            Boolean filled=false;
            if(!list.contains(2) && !list.contains(3) && !list.contains(4) && !list.contains(5)){
                filled=true;
                count++;
            }
            if(!list.contains(6) && !list.contains(7) && !list.contains(8) && !list.contains(9)){
                filled=true;
                count++;
            }
            if(!filled){
                if(!list.contains(4) && !list.contains(5) && !list.contains(6) && !list.contains(7)){
                count++;
               }
            }
        }
        return count;
    }
}