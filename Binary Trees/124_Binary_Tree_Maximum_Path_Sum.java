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
    int max=Integer.MIN_VALUE;
    int path(TreeNode h) {
        if(h==null) return 0;
        int left=Math.max(0,path(h.left));
        int right=Math.max(0,path(h.right));
        max=Math.max(max,h.val+left+right);
        return h.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int sum=path(root);
        int s=max;
        max=Integer.MIN_VALUE;
        return s;
    }
}
