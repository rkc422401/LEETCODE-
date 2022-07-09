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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d=new int[1];
        helper(root,d);
        return d[0];
    }
    int helper(TreeNode node,int[] d){
        if(node==null) return 0;
        
        
        int lh=helper(node.left,d);
        int rh=helper(node.right,d);
        
        d[0]=Math.max(d[0],lh+rh);
        
        return 1+Math.max(lh,rh);
    }
}