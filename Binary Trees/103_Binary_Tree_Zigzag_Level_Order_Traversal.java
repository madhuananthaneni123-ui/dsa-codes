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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean righttoleft=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode h=q.poll();
                    if(h.left!=null) q.add(h.left);
                    if(h.right!=null) q.add(h.right);
                li.add(h.val);
            }
            if(!righttoleft){
                Collections.reverse(li);
            }
            ans.add(li);
            righttoleft=!righttoleft;
        }
        return ans;
    }
}
