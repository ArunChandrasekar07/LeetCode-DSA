class Solution {
    public int countGoodRotations(int[] nums) {
        long fir=0;
        long sec=0;
        int check=(nums.length/2);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i<check){
                fir+=nums[i];
            }
            else{
                sec+=nums[i];
            }
        }
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(fir>sec){
                ans++;
            }
            int lf=nums[j];
            int mf=nums[(j+check)%n];
            fir=fir-lf+mf;
            sec=sec-mf+lf;
        }
        return ans;
    }
}