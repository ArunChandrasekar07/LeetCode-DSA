class Solution {
    public void nextPermutation(int[] nums) {
        int pos=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pos=i-1;
                break;
            }
        }
        if(pos<0){
            int l=0;
            int r=nums.length-1;
            while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
        }
        else{
            for(int j=nums.length-1;j>=0;j--){
                if(nums[pos]<nums[j]){
                    int temp=nums[pos];
                    nums[pos]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
            int l=pos+1;
            int r=nums.length-1;
            while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
        }
    }
}