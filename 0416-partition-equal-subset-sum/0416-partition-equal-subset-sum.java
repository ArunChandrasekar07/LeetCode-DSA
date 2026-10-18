class Solution {
    public boolean canPartition(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            target+=nums[i];
        }
        if(target%2!=0){
            return false;
        }
        target=(target/2);
        boolean[] check=new boolean[target+1];
        check[0]=true;
        int sum=0;
        for(int j=nums.length-1;j>=0;j--){
            for(int k=target;k>=nums[j];k--){
                check[k]=check[k] || check[k-nums[j]];
            }
        }
        return check[target];
    }
}