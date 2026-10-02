/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void sol(TreeNode head,List<Integer> li) {
        if(head==null) return;
        sol(head.left,li);
        li.add(head.val);
        sol(head.right,li);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        sol(root,li);
        return li;
    }
}
