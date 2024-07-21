class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxlen=Integer.MIN_VALUE;
        int sum=0;
         for(int i=0;i<n;i++){

            sum=sum+nums[i];

            if(sum>maxlen){
                maxlen=sum;
            }
            if(sum<0){
                sum=0;
            }
         }
         return maxlen;
    }
}
