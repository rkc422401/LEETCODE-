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
    public void flatten(TreeNode root) {
        //so there are two methord to solve this the ine is the recursive and the other one is the morris travesal 
        //recusive the sapce the recusion stack space and the time complexity is the order of n
        if(root==null) return;
        TreeNode lst=root.left;
        TreeNode rst=root.right;
        
        root.left=null;
        
        flatten(lst);
        flatten(root.right);
        
        root.right=lst;
        TreeNode curr=root;
        while(curr.right !=null) curr=curr.right;
        curr.right=rst;
    }
}