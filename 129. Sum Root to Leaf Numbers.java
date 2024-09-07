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
    int sum=0;
    void pathsum(TreeNode root,int rs){
        if(root==null) return;

        if(root.left ==null && root.right==null)
        sum=sum+(rs*10+root.val);
        pathsum(root.left,rs*10+root.val);
        pathsum(root.right,rs*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        pathsum(root,0);
        return sum;
    }
}
