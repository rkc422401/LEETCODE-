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
    static int kth=0;
    static int ksmall=0;
    public int kthSmallest(TreeNode root, int k) {
        kth=0;
        ksmall=0;
        inorder(root,k);
        return ksmall;
    }
     static void inorder(TreeNode node,int k)
    {
        if(node == null)
        {
            return ;
        }
        
        inorder(node.left , k);
        
        kth++;
        if(kth==k)
        {
            ksmall=node.val;
            //return;
        }
        
        inorder(node.right,k);
    }
}