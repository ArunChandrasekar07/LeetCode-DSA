class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int sec=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                sec=max;
                max=nums[i];
                ind=i;
            }
            else if(sec<nums[i]){
                sec=nums[i];
            }
        }
        if(max>=(sec*2)){
            return ind;
        }
        else{
            return -1;
        }
    }
}