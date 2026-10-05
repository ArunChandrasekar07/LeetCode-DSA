class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

/* class Solution {
    public int sort(int[] nums,int l,int r,int target){
        int pivot=nums[r];
        int temp=0;
        int i=l;
        for(int j=l;j<r;j++){
            if(nums[j]<pivot){
                temp=nums[i];
                nums[i++]=nums[j];
                nums[j]=temp;
            }
        }
        temp=nums[i];
        nums[i]=nums[r];
        nums[r]=temp;
        if(target<i){
            return sort(nums,l,i-1,target);
        }
        else if(target>i){
            return sort(nums,i+1,r,target);
        }
        else{
            return pivot;
        }
    }
    public int findKthLargest(int[] nums, int k) {
        int target=nums.length-k;
        return sort(nums,0,nums.length-1,target);
    }
}
 */

/* class Solution {
    public int findKthLargest(int[] nums, int k) {
        int index=0;
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++){
                if(set.contains(j)){
                    continue;
                }
                if(max<nums[j]){
                    max=nums[j];
                    index=j;
                }
            }
            set.add(index);
            ans=max;
        }
        return ans;
    }
} */