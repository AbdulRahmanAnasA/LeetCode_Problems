class Solution {
    public int[] singleNumber(int[] nums) {
        long xor=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        int n1=0;
        int n2=0;
         int rightmost=(int)(xor&(xor-1)^xor);
        for(int i=0;i<n;i++){
            if((nums[i]&rightmost)==0)
            n1=n1^nums[i];
            else
            n2=n2^nums[i];
        }
        return  new int[]{n1,n2};
    }
}
