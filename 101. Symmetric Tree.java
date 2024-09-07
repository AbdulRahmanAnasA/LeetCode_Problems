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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return aremirror(root.left,root.right);
    }
    public boolean aremirror(TreeNode a, TreeNode b ){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val != b.val) return false;
        
        return aremirror(a.left,b.right) && aremirror(a.right,b.left);
    }
}