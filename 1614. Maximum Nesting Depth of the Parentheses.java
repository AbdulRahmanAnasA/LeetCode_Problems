class Solution {
    public int maxDepth(String s) {
      int max=0;
        int j=0;
        
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            j++;
        }
        else if(s.charAt(i)==')'){
            j--;
        }
        if(j>max){
            max=j;
        }
        }
        return max;
    }
}
