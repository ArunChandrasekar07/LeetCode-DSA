class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int left=1;
        int n=0;
        for(int i=0;i<nums.length;i++){
            ans[n++]=left;
            left*=nums[i];
        }
        int right=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]*=right;
            right*=nums[j];
        }
        return ans;
    }
}

/* class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] store=new int[nums.length];
        int j=0;
        int mul=1;
        while(j<nums.length){
            for(int i=0;i<nums.length;i++){
                if(i!=j){
                    mul*=nums[i];
                }
            }
            store[j++]=mul;
            mul=1;
        }
        return store;
    }
} */