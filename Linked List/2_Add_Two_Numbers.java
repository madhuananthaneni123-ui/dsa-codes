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
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;
        int carry=0;
        while(t1!=null && t2!=null){
            int add=t1.val+t2.val;
            int put=(add+carry)%10;
            carry=(add+carry)/10;
            ListNode q=new ListNode(put);
            ans.next=q;
            ans=ans.next;
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            int add=t1.val;
            int put=(add+carry)%10;
            carry=(add+carry)/10;
            ListNode q=new ListNode(put);
            ans.next=q;
            ans=ans.next;
            t1=t1.next;
        }
        while(t2!=null){
            int add=t2.val;
            int put=(add+carry)%10;
            carry=(add+carry)/10;
            ListNode q=new ListNode(put);
            ans.next=q;
            ans=ans.next;
            t2=t2.next;
        }
        if(carry!=0){
            ListNode q=new ListNode(carry);
            ans.next=q;
        }
        return dummy.next;
    }
}
