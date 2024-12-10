class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack <>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
         // Remove remaining k digits from the end of the stack
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
         // Construct the resulting string from the stack
        StringBuilder sb=new StringBuilder ();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

       sb.reverse();
         // Remove leading zeros
       while(sb.length()>0 && sb.charAt(0)=='0' ){
        sb.deleteCharAt(0);
       }
        // Handle edge case where result might be empty
       return sb.length()>0?sb.toString():"0";


    }
}
