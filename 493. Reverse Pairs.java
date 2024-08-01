///optimal method

class Solution {
    private static void merge(int nums[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
                left++;
        }
        while(right<=high){
             temp.add(nums[right]);
                right++;
        }

        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
        
    }

private static int countpairs(int nums[],int low, int mid,int high){
    int right=mid+1;
    int count=0;
    for(int i=low;i<=mid;i++){
       while (right <= high && (long) nums[i] > 2 * (long) nums[right])  {
            right++;
        }
        count+=right-(mid+1);
    }
    return count;
}



private static int mergesort(int nums[],int low,int high){
    int count=0;
    if(low>=high) return count;
    int mid=(low+high)/2;

    count+=mergesort(nums,low,mid);
    count+=mergesort(nums,mid+1,high);
    count+=countpairs(nums,low,mid,high);
    merge(nums,low,mid,high);

    return count;
}

    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }

}

//Brute force method

class Solution {
    public int reversePairs(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>2*nums[j]){
                    cnt++;
                    }
            }
        }
        return cnt;

    }
}
