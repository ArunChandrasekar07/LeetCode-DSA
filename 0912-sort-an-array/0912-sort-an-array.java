class Solution {
    public static void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public static void merge(int[] nums,int l,int mid,int r){
            int i=l;
            int j=mid+1;
            int k=0;
            int[] temp=new int[r-l+1];
            while(i<=mid && j<=r){
                if(nums[i]<nums[j]){
                    temp[k++]=nums[i++];
                }
                else{
                    temp[k++]=nums[j++];
                }
            }
            while(i<=mid){
                temp[k++]=nums[i++];
            }
            while(j<=r){
                temp[k++]=nums[j++];
            }
            for(int x=0;x<temp.length;x++){
                nums[l+x]=temp[x];
            }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}