class Solution {
    public int longestSubsequence(int[] nums) {
        int num=0;
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                check=true;
            }
            num^=nums[i];
        }
        if(num!=0){
            return nums.length;
        }
        else{
            if(check){
                return nums.length-1;
            }
            else{
                return 0;
            }
        }
    }
}