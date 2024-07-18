class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1=s.length();
        int len2= t.length();

        if(len1!=len2){
            return false;
        }
        int indexS[]=new int[256];
        int indexT[]=new int[256
        ]; 
        for(int i=0;i<len2;i++){
               if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
               }
               indexS[s.charAt(i)]=i+1;
               indexT[t.charAt(i)]=i+1;
        }
        return true;
           }
}
