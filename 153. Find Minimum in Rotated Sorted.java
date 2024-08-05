class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
      int low=0;
      int high=n-1;
       while(low<=high){
          int mid= (low+high)/2;
          if(nums[low]<=nums[mid]){
            min=Math.min(min,nums[low]);
             min=Math.min(min,nums[mid]);
             low=mid+1;
              }
          else{
              
               min=Math.min(min,nums[mid]);
              high=mid-1;
          }
      
    }
    return min;
}
}
