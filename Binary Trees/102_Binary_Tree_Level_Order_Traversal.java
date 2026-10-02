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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode h=q.poll();
                if(h.left!=null) q.add(h.left);
                if(h.right!=null) q.add(h.right);
                ans.add(h.val);
            }
            li.add(ans);
        }
        return li;
    }
}
