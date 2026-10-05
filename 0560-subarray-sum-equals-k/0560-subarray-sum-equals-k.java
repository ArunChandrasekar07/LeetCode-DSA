class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int add=0;
            for(int j=i;j<nums.length;j++){
                add+=nums[j];
                if(add==k){
                    ans++;
                }
            }
        }
        return ans;
    }
}