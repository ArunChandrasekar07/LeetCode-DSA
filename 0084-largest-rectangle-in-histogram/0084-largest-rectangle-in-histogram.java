class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int cur=heights[st.pop()];
                int l=st.isEmpty() ? -1 : st.peek();
                area=Math.max(area,(cur*(i-l-1)));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int cur=heights[st.pop()];
            int l=st.isEmpty() ? -1 : st.peek();
            area=Math.max(area,(cur*(heights.length-l-1)));
        }
        return area;
    }
}

/* class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        for(int i=0;i<heights.length;i++){
            int l=i-1;
            int r=i+1;
            int count=1;
            while(l>=0 && heights[l]>=heights[i]){
                count++;
                l--;
            }
            while(r<heights.length && heights[r]>=heights[i]){
                count++;
                r++;
            }
            area=Math.max(area,(heights[i]*count));
        }
        return area;
    }
} */