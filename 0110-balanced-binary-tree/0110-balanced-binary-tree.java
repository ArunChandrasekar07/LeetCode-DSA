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
        if(root==null){
            return true;
        }
        return check(root)!=-1;
    }
    private int check(TreeNode node){
        if(node == null){
            return 0;
        }
        int ll=check(node.left);
        int rr=check(node.right);
        if(ll==-1 || rr==-1){
            return -1;
        }
        if(Math.abs(ll-rr)>1){
            return -1;
        }
        else{
            return Math.max(ll,rr)+1;
        }
    }
}