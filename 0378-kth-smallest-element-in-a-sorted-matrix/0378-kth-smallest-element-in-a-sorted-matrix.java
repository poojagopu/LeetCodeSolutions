class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>maxHeap=new PriorityQueue<Integer>((o1,o2)->Integer.compare(o2,o1));
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                maxHeap.add(matrix[i][j]);
                if(maxHeap.size()>k)maxHeap.poll();
            }
        }
        return maxHeap.poll();
    }
}