//Brute force Solution ,but not work in Leetcode(TLE)

class Solution {
    public static Boolean possible(int arr[],int day,int m,int k){
        int count=0;
        int noofb=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                noofb+=count/k;
                count=0;
            }
        }
         noofb+=count/k;
         return noofb>=m;
    }

    public int minDays(int[] arr, int m, int k) {
               long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        for (int i = mini; i <= maxi; i++) {
            if (possible(arr, i, m, k))
                return i;
        }
        return -1;
    }
}

///optimal solution(binary search)

class Solution {
    public static Boolean possible(int arr[],int day,int m,int k){
        int count=0;
        int noofb=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                noofb+=count/k;
                count=0;
            }
        }
         noofb+=count/k;
         return noofb>=m;
    }

    public int minDays(int[] arr, int m, int k) {
        long value=(long)m*k;
        if(value>arr.length)
        return -1;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
             min=Math.min(min,arr[i]);
        }
      
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k))
            high=mid-1;
            else
            low=mid+1;
        }
            return low;
              }
}
