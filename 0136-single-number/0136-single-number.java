class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int x:nums){
            ans^=x;
        }
        return ans;
    }
}

/* class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int cur=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            count++;
            if(cur!=nums[i]){
                if(count<2){
                    return cur;
                }
                cur=nums[i];
                count=0;
            }
        }
        return cur;
    }
} */