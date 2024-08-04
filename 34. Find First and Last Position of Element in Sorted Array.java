class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int result1=-1;
        int high=n-1;
///first occurence
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result1=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
///second occurence
        low=0;
        int result2=-1;
        high=n-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result2=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int [] {result1,result2};
    }
}
