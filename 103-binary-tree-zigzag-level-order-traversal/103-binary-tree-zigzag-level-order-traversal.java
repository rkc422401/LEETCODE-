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
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        boolean is=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode rem=q.poll();
                if(rem.left !=null) q.offer(rem.left);
                if(rem.right !=null) q.offer(rem.right);
                if(is==true) temp.add(rem.val);
                else temp.add(0,rem.val);
            }
            is=!is;
            ans.add(temp);
        }
        return ans;
    }
}