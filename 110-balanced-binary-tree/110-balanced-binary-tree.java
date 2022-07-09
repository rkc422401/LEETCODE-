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
    public boolean isBalanced(TreeNode root) {
        return helper(root) !=-1;  //true if it retrun the heoghtof the bianry tree and faosle if teh height if the tree is -1;
    }
    int helper(TreeNode node){
        if(node==null) return 0;
        int lh=helper(node.left);
        if(lh==-1) return -1;
        
        int rh=helper(node.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        
        return 1+Math.max(lh,rh);
    }
}