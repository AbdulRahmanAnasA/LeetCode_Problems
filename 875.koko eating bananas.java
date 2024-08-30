class Solution {
    public int minEatingSpeed(int[] ban, int h) {
        int n=ban.length;
        int tothrs=0;
        int maxele=0;
        for(int i=0;i<n;i++){
            maxele=Math.max(maxele,ban[i]);  ///find max of arr elements
        }
        int left=1;
        int right=maxele;

        while(left<=right){
            tothrs=0;                  //binary search for log n tc
            int mid=(left+right)/2;                            
            for(int i=0;i<n;i++){       //condition for checking ans
            tothrs+=Math.ceil((double)ban[i]/mid);
            if(tothrs>h) break;
            }
            if(tothrs<=h) right=mid-1;
            else left=mid+1;

        }
        return left;
    }
}
