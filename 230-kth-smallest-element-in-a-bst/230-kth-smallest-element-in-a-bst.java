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
    static int ki=0;
    static int ks=0;
    public int kthSmallest(TreeNode root, int k) {
        ks=0;
        ki=0;
        in(root,k);
        return ks;
    }
    void in(TreeNode node,int k){
        if(node==null) return;
        in(node.left,k);
        ki++;
        if(k==ki){
            ks=node.val;
            return;
        }
        in(node.right,k);
    }
}