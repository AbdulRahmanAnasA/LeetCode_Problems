// Brute force
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int count=0;
        int left[]=new int [n];
        int right[]=new int [n];
         
         left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }

        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        for(int i=0;i<n;i++){
            count+=Math.min(left[i],right[i])-arr[i];
        }
        return count;

    }
}

TC==O(3N)
SC==O(2N)

//optimal solution

  class Solution {
    public int trap(int[] arr) {
        int ans=0;
        int left=0;
        int lm=0;
        int rm=0;
        int right=arr.length-1;
        

        while(left<=right){
            if(arr[left]<arr[right]){
                if(lm<arr[left]){
                    lm=arr[left];
                }
                else{
                    ans+=lm-arr[left];
                    left++;
                }
            }
            else{
                if(rm<arr[right]){
                    rm=arr[right];
                }
                else{
                    ans+=rm-arr[right];
                    right--;
                }
            }
        }
        return ans;
            }
}
