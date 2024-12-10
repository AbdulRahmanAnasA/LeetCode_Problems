class Solution {
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
