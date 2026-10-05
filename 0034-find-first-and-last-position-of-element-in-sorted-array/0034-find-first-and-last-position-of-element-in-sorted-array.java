class Solution {
    public static int check(int[] nums,int target,boolean con){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                if(con){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=check(nums,target,true);
        ans[1]=check(nums,target,false);
        return ans;
    }
}