class NumArray {
    int[] pref;
    public NumArray(int[] nums) {
        pref=new int[nums.length+1];
        pref[0]=0;
        for(int i=1;i<=nums.length;i++){
            pref[i]=pref[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return pref[right+1]-pref[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */