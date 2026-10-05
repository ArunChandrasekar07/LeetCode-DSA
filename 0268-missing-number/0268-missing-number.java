class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int exp=(n*(n+1))/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return exp-sum;
    }
}

/* class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        if(nums[0]!=0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=n){
                return n;
            }
            n++;
        }
        return n;
    }
} */