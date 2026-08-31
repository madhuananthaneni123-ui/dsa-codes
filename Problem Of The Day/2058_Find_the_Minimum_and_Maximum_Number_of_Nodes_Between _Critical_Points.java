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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode cur=head.next;
        ListNode prev=head;
        int curn=2;
        int f=0;
        int p=0;
        int mindis=Integer.MAX_VALUE;
        int maxdis=0;
        while(cur.next!=null){
            if((cur.next.val>cur.val && prev.val>cur.val) || (cur.next.val<cur.val && prev.val<cur.val)){
                if(p==0){
                    f=curn;
                    p=curn;
                }
                else{
                    mindis=Math.min(mindis,curn-p);
                    p=curn;
                }
            }
            curn++;
            prev=cur;
            cur=cur.next;
        }
        if(mindis==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        maxdis=p-f;
        return new int[]{mindis,maxdis};
    }
}
