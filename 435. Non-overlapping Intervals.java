class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       int n=intervals.length;
       int count=0;
       int end=Integer.MIN_VALUE;
       if(n==0) return 0;
       Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));

       for(int i=0;i<n;i++){
        if(intervals[i][0]>=end){
            end=intervals[i][1];
        }
        else{
            count++;
        }
       }

        return count; // Return the number of intervals to remove
    }
}
