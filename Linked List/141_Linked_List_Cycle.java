/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        HashSet<ListNode> hm=new HashSet<>();
        ListNode ptr=head;
        ListNode temp=null;
        while(ptr.next!=null && !hm.contains(ptr.next)){
            hm.add(ptr);
            ptr=ptr.next;
        }
        if(hm.contains(ptr.next))return true;
        if(ptr.next==null) return false;
        return false;
    }
}
