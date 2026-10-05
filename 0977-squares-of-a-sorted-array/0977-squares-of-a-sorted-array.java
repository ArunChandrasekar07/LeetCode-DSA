class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int k=0;
        for(int x:nums){
            ans[k++]=x*x;
        }
        Arrays.sort(ans);
        return ans;
    }
}