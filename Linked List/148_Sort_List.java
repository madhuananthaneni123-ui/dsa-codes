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
    ListNode middleelement(ListNode h){
        if(h==null ||h.next==null) return h;
        ListNode slow=h;
        ListNode fast=h.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
    ListNode mergesort(ListNode head){
        if(head==null ||head.next==null) return head;
        ListNode middle=middleelement(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;
        left=mergesort(left);
        right=mergesort(right);
        return merge(left,right);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode t1=left;
        ListNode t2=right;
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                dummy.next=t1;
                t1=t1.next;
            }
            else{
                dummy.next=t2;
                t2=t2.next;
            }
            dummy=dummy.next;
        }
        if(t1!=null) dummy.next=t1;
        if(t2!=null) dummy.next=t2;
        return temp.next;
    }
}
