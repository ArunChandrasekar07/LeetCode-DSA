class KthLargest {
    int k;
    int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
    }
    
    public int add(int val) {
        int[] store=new int[nums.length+1];
        int i=0;
        for(int x:nums){
            store[i++]=x;
        }
        store[i++]=val;
        Arrays.sort(store);
        nums=store;
        return store[store.length-k];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */