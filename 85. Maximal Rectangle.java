class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int m=matrix.length;
        int n=matrix[0].length;

        int height []=new int[n];

        for(int i=0; i<m ;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]=='0'){
                        height[j]=0;
                    }
                    else{
                        height[j]=height[j]+1;
                    }
                }
           ans=Math.max(ans,largestRectangleArea(height));
        } 
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int maxArea=0;

        for(int i=0;i<=heights.length;i++){
            int currentHeight=(i==heights.length)?0:heights[i];

            while(!st.isEmpty() && heights[st.peek()]>currentHeight){
                int height=heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
