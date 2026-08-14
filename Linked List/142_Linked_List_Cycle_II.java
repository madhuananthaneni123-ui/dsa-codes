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
    public ListNode detectCycle(ListNode head) {
        if(head==null ||head.next==null) return null;
        HashSet<ListNode> hm=new HashSet<>();
        ListNode ptr=head;
        while(ptr.next!=null && !hm.contains(ptr.next)){
            hm.add(ptr);
            ptr=ptr.next;
        }
        if(hm.contains(ptr.next)) return ptr.next;
        return null;
    }
}
