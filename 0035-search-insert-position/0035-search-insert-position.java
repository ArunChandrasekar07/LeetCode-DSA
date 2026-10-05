class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
        }
        return l;
    }
}

/* 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length;i++){
            if(target<nums[i]){
                break;
            }
            if(target==nums[i]){
                return i;
            }
        }
        return i;
    }
} */