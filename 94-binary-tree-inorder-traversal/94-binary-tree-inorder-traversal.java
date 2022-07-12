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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null) return ans;
        helper(root,ans);
        return ans;
    }
    void helper(TreeNode node,ArrayList<Integer> ans){
        if(node==null) return;
        helper(node.left,ans);
        ans.add(node.val);
        helper(node.right,ans);
    }
}