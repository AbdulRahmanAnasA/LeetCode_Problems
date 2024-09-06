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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> res1= new ArrayList<>();
        List<Integer> res2= new ArrayList<>();

        dft(root1,res1);
        dft(root2,res2);

        return res1.equals(res2);
 }
     public void dft( TreeNode root,List<Integer> res){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            res.add(root.val);
        }
        dft(root.left,res);
         dft(root.right,res);
     }
}
