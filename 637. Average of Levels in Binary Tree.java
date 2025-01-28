class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        if(root==null)  return result;

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for(int index=0;index<size;index++){
                TreeNode node=q.poll();
                sum=sum+node.val;

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

            }
            result .add(sum/size);
        }
        return result;
    }
}
