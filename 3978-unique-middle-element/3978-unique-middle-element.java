class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int num=nums.length;
        int n=num/2;
        int ans=nums[n];
        for(int i=0;i<nums.length;i++){
            if(i==n){
                continue;
            }
            if(nums[i]==ans){
                return false;
            }
        }
        return true;
    }
}