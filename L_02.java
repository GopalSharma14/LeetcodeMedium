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
        ListNode dummy= new ListNode();
        ListNode head= dummy;
        int carry=0;
        while(l1!=null || l2!= null || carry!=0){
            ListNode current = new ListNode();
            int sum=((l1==null)?0:l1.val) + ((l2==null)?0:l2.val)+carry;
            carry=sum/10;
            current.val= sum%10;
            head.next = current;
            head= current;
            
            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return dummy.next;
        
    }
}