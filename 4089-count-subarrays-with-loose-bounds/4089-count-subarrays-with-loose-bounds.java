class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int bad=-1;
        long ans=0;
        int[] val=nums.clone();
        for(int i=0;i<nums.length;i++){
            if(val[i]<minK || val[i]>maxK){
                bad=i;
            }
            ans+=i-bad;
        }
        return ans;
    }
}