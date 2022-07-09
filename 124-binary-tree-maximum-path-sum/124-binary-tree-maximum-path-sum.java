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
    public int maxPathSum(TreeNode root) {
        int[] d=new int[1];
        d[0]=Integer.MIN_VALUE;
        helper(root,d);
        return d[0];
    }
    int helper(TreeNode node,int[] d){
        if(node==null) return 0;
        
        int lh=Math.max(0,helper(node.left,d));
        int rh=Math.max(0,helper(node.right,d));
        
        d[0]=Math.max(d[0],lh+rh+node.val);
        
        
        return node.val +Math.max(lh,rh);
    }
}