/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode ans=mergeK(lists,0,lists.length-1);
        return ans;
    }
    public ListNode mergeK(ListNode[] lists, int i, int j){
        if(i==j)return lists[i];
        int mid=i+(j-i)/2;
        return mergeTwoLists(mergeK(lists,i,mid),mergeK(lists,mid+1,j));
    }
    
    public ListNode mergeTwoLists(ListNode l1 , ListNode l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}