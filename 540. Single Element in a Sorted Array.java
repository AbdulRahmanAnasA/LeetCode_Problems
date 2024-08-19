class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0]; //if it has only one element
        if(arr[0] != arr[1]) return arr[0];  //if the first element is single
        if(arr[n-1] != arr[n-2]) return arr[n-1];  //if the last element is single

        int low=1;  
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid+1] != arr[mid] && arr[mid-1] != arr[mid]){ 
                return arr[mid];
            }
            if((mid%2==1 && arr[mid]==arr[mid-1]) ||(mid%2==0 && arr[mid]==arr[mid+1]) ){
                low=mid+1;  ///(even,odd) ->element in right half -> eliminate left half
            }
            else{
                high=mid-1; ///(odd,even) ->element in left half -> eliminate right half
            }
        }

        return -1;
    }
}
