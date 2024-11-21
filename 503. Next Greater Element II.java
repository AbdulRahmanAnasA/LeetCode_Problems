class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ng[]=new int [n];
        Stack<Integer> s=new Stack<>();

        for(int i=2*n-1;i>=0;i--){

            while(!s.isEmpty() && nums[s.peek()] <=nums[i%n]){
                s.pop();
            }
            if(s.isEmpty()){
                ng[i%n]=-1;
            }
            else
            ng[i%n]=nums[s.peek()];

            s.push(i%n);
        }
        return ng;
    }
}
