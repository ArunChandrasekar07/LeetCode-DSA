class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int minwall=Math.min(height[l],height[r]);
            int area=(r-l)*minwall;
            ans=Math.max(ans,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}