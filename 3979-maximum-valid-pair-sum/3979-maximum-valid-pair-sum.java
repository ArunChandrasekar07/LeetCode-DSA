class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxprefix=nums[0];
        int max=0;
        for(int j=k;j<nums.length;j++){
            maxprefix=Math.max(maxprefix,nums[j-k]);
            max=Math.max(max,maxprefix+nums[j]);
        }
        return max;
    }
}