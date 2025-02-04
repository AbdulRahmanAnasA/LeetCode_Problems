class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign=true;


        if((dividend >=0 && divisor < 0)||(dividend <0 && divisor >= 0))
        sign=false;
        if(dividend==divisor)
        return 1;

       long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int quotient = 0;
        while(n>=d){
            int cnt=0;
            while(n>=d<<cnt+1){
                cnt+=1;
            }
            quotient+=1<<cnt;
            n-=d<<cnt;
        }
         
          if(quotient == (1<<31) && sign)
        return Integer.MAX_VALUE;

         if(quotient == (1<<31) && !sign)
        return Integer.MIN_VALUE;

        return sign ?quotient:-1*quotient;


    }
    }
