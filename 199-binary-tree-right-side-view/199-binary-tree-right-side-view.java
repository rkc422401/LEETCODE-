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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<Integer>();
        if(root==null) return ans;
        helper(0,ans,root);
        return ans;
    }
    void helper(int depth,List<Integer> ans ,TreeNode node){
        if(node==null) return;
        if(depth==ans.size()) ans.add(node.val);
        helper(depth+1,ans,node.right);
        helper(depth+1,ans,node.left);
    }
}