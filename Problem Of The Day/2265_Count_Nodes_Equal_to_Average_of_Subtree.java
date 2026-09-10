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
    class pair{
        int x;
        int y;
        pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    int max=0;
    pair post(TreeNode root){
        if(root==null) return new  pair(0,0);
        pair left=post(root.left);
        pair right=post(root.right);
        int cur=left.x+right.x+root.val;
        int no=left.y+right.y+1;
        if(cur/no == root.val) max++;
        return new pair(cur,no);
    }
    public int averageOfSubtree(TreeNode root) {
        pair n=post(root);
        int cnt=max;
        max=0;
        return cnt;
    }
}
