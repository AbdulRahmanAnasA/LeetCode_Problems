class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int tp=0;
        for(int i = 1 ; i < n ; i++){
            int p=nums[i]-nums[i-1];
            if(p>0){
                tp+=p;
            }
        }

        return tp;
    }
}
