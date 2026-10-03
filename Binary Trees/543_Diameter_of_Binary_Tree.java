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
    int height(TreeNode h) {
        if(h==null) return 0;
        int left=height(h.left);
        int right=height(h.right);
        return Math.max(left,right)+1;
    }
    int diameter(TreeNode h) {
        if(h==null) return 0;
        int lefth=height(h.left);
        int righth=height(h.right);
        int cur=lefth+righth;
        int dleft=diameter(h.left);
        int dright=diameter(h.right);
        return Math.max(cur,Math.max(dleft,dright));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
}
