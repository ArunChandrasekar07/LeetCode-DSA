class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int bad=-1;
        long ans=0;
        int[] vol=nums.clone();
        for(int i=0;i<nums.length;i++){
            if(vol[i]<minK || vol[i]>maxK){
                bad=i;
            }
            ans+=i-bad;
        }
        return ans;
    }
}