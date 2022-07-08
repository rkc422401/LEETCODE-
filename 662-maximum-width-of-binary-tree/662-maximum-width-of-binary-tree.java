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
class Pair{
    int index;
    TreeNode node;
    Pair(TreeNode node,int index){
        this.node=node;
        this.index=index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        //for storing the node and the index so that access index 
        if(root==null) return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));       //first to put the root in the queue
        while(!q.isEmpty()){
            int n=q.size();
            int minval=q.peek().index;
            int first=0,last=0;
            for(int i=0;i<n;i++){
                int curr=q.peek().index-minval;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first=curr;
                if(i==n-1) last=curr;
                if(node.left !=null){
                    q.offer(new Pair(node.left,2*curr+1));
                }
                if(node.right !=null){
                    q.offer(new Pair(node.right,2*curr+2));
                }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}