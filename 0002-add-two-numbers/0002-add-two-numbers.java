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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=new ListNode();
        ListNode temp=head;
        while(l1!=null || l2 !=null || carry==1){
            int val=0;
            if(l1!=null){
                val=val+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                val=val+l2.val;
                l2=l2.next;
            }
            val=val+carry;
            if(val>9){
                val=val%10;
                carry=1;
            }else{
                carry=0;
            }
            ListNode curr=new ListNode(val);
            temp.next=curr;
            temp=temp.next;
        }
        return head.next;
    }
}