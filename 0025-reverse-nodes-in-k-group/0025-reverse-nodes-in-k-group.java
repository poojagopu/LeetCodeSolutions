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
    public int length(ListNode head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
        return count;
        }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr,next=null;
        ListNode temp=new ListNode();
        ListNode prev=temp;
        prev.next=head;
        int len=length(head);
        while(len>=k){
            curr=prev.next;
            next=curr.next;
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            len=len-k;
        }
        return temp.next;
        
    }
}