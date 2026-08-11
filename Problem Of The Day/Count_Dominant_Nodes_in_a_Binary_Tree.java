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
class pair{
    int maxvalue;
    int cnt;
    pair(int max,int cnt){
        this.maxvalue=max;
        this.cnt=cnt;
    }
}

class Solution {
    pair dfs(TreeNode r){
    if(r==null) return new pair(Integer.MIN_VALUE,0);
    pair left=dfs(r.left);
    pair right=dfs(r.right);
    int mx=Math.max(r.val,Math.max(left.maxvalue,right.maxvalue));
    int cnt=left.cnt+right.cnt;
    if(r.val==mx) cnt++;
    return new pair(mx,cnt);
}
    public int countDominantNodes(TreeNode r) {
        TreeNode sam=r;
        return dfs(sam).cnt;
    }
}
