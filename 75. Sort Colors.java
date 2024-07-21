class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int r=0;
        int w=0;
        int g=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r++;
            }
            else if(nums[i]==1){
                w++;
            }
            else if(nums[i]==2){
                g++;
            }
        }
        int j=0;
        while(r!=0){
           nums[j]=0;
           r--;
           j++;
        }
        while(w!=0){
           nums[j]=1;
           w--;
           j++;
        }
        while(g!=0){
           nums[j]=2;
           g--;
             j++;
        }
    }
}
