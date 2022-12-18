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
        ListNode ansList=new ListNode();
        ListNode dummy=ansList;
        while(l1!=null || l2!=null || carry==1){
            int value=0;
            if(l1!=null){
                value=value+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                value=value+l2.val;
                l2=l2.next;
            }
            value=value+carry;
            carry=value/10;
            ListNode newList=new ListNode(value%10);
            dummy.next=newList;
            dummy=dummy.next;
        }
        
        return ansList.next;
    }
    
}