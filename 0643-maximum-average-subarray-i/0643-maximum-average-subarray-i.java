class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Integer.MIN_VALUE;
        int l=0;
        int r=k-1;
        double sum=0;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        ans=Math.max(ans,(sum/k));
        sum-=nums[l];
        l++;
        r++;
        while(r!=nums.length){
            sum+=nums[r];
            ans=Math.max(ans,(sum/k));
            sum-=nums[l];
            l++;
            r++;
        }
        return ans;
    }
}