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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=new ListNode();
        ListNode prev=dummy;
        ListNode curr=head;
        
        while(curr!=null && curr.next!=null){
            prev.next=curr.next;
            ListNode next=curr.next.next;//3
            curr.next.next=curr;
            curr.next=next;
            prev=curr;
            curr=curr.next;  
        }
        return dummy.next;
        
    }
}