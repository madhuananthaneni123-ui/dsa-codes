/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hm=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            hm.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(hm.contains(temp)) return temp;
            temp=temp.next;
        }
        return null;
    }
}
