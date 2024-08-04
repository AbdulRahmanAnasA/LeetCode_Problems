class Solution {
    public int search(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k)  return mid;
          //left sorted
        if(nums[low]<=nums[mid]){
            if(nums[low]<= k && k<=nums[mid])
            high=mid-1;
            else
            low=mid+1;
        }
        else{  //right sorted
             if(nums[mid]<= k && k<=nums[high])
            low=mid+1;
            else
            high=mid-1;
        }
    }
    return -1;
    }
}
