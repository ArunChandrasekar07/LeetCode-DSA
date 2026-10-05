class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int add=nums[0];
        for(int j=1;j<nums.length;j++){
            add=Math.max(nums[j],add+nums[j]);
            ans=Math.max(ans,add);
        }
        return ans;
    }
}