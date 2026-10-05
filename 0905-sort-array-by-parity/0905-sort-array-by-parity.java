class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int k=0;
        int m=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
            else{
                ans[m--]=nums[i];
            }
        }
        return ans;
    }
}