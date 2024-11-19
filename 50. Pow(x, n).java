class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long m=n;
        if(m<0){
            m=-m;
            x=1/x;
        }

        while(m>0){
            if(m%2==1){
                ans=ans*x;
            }
            x=x*x;
            m=m/2;
        }
        return ans;
    }
}
