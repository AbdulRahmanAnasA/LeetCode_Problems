class Solution {
    public int[] runningSum(int[] nums) {
     
      int res=nums[0];
      
     int arr[]=new int [nums.length];
     arr[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        arr[i]=res+nums[i];
        res=arr[i];
       }
return arr;

    }
}
