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
        ListNode curr=head;
        ListNode temp=new ListNode();
        ListNode prev=temp;
        prev.next=curr;
       
        while(curr!=null && curr.next!=null){
            ListNode next=curr.next;
            prev.next=curr.next;
            curr.next=next.next;
            next.next=curr;
            prev=curr;
            curr=prev.next;
        }
        return temp.next;
    }
}