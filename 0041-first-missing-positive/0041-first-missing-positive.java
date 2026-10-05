class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        int n=0;
        while(n < nums.length && nums[n] <= 0){
            n++;
        }
        for(int i=n;i<nums.length;i++){
            if(i+1 < nums.length && nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]!=j){
                return j;
            }
            j++;
        }
        return j;
    }
}