class Solution {
    public int sumSubarrayMins(int[] arr) {
        long left[]=new long [arr.length];
        long right[]=new long [arr.length];

        Stack<Integer>ngel=new Stack<>();
        Stack<Integer>nger=new Stack<>();
//Next Greater Element left
        for(int i=0;i<arr.length;i++){
            int l=-1;

            while(!ngel.isEmpty() && arr[ngel.peek()]>=arr[i]){
                    ngel.pop();
            }

            if(!ngel.isEmpty()){
               l= ngel.peek();
            }

            left[i]=i-l-1;
            ngel.push(i);
                 }
//Next Greater Element left
                  for(int i=arr.length-1;i>=0;i--){
            int r=arr.length;

            while(!nger.isEmpty() && arr[nger.peek()]>arr[i]){
                    nger.pop();
            }

            if(!nger.isEmpty()){
               r= nger.peek();
            }

            right[i]=r-i-1;
            nger.push(i);
                 }
     long ans = 0; // Variable to store the final result
        int mod = 1_000_000_007; // Modulo for result
        for(int i=0;i<arr.length;i++){
            ans+=(left[i]*right[i]+1+left[i]+right[i])*arr[i];
            ans%=mod;
        }
        return (int)ans;
    }
}
