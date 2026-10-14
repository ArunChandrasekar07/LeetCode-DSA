class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] df=new int[nums.length];
        Arrays.fill(df,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    df[i]=Math.max(df[i],df[j]+1);
                }
            }
        }
        Arrays.sort(df);
        return df[df.length-1];
    }
}