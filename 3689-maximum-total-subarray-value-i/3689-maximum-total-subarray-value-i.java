class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=0;
        long min=nums[0];
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return (max - min) * k;
    }
}