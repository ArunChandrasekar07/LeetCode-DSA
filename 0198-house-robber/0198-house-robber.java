class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int ans=0;
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            ans=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}