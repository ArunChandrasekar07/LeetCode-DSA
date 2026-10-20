class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int ans=0;
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length-1;i++){
            ans=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=ans;
        }
        int ans1=0;
        int prev11=nums[1];
        int prev22=0;
        for(int i=2;i<nums.length;i++){
            ans1=Math.max(nums[i]+prev22,prev11);
            prev22=prev11;
            prev11=ans1;
        }
        return Math.max(ans,ans1);
    }
}