class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=nums.clone();
        int n=k%temp.length;
        if(n==0){
            return;
        }
        int j=0;
        for(int i=(temp.length-n);i<temp.length;i++){
            nums[j++]=temp[i];
        }
        for(int i=0;i<(temp.length-n);i++){
            nums[j++]=temp[i];
        }
        return;
    }
}