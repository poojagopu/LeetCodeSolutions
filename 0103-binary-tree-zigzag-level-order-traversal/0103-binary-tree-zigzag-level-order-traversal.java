/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        boolean flag=false;
        
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(flag==false){
                    list.add(curr.val);
                }else{
                    list.add(0,curr.val);
                }
            }
            flag=!flag;
            ans.add(list);   
        }
        return ans;
    }
}