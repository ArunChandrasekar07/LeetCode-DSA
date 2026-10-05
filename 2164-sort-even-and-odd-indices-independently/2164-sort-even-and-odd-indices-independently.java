class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd=new int[nums.length/2];
        int[] even=new int[(nums.length+1)/2];
        int i=0;
        int j=0;
        for(int x=0;x<nums.length;x++){
            if(x%2==0){
                even[i++]=nums[x];
            }
            else{
                odd[j++]=nums[x];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int o=1;
        int e=0;
        for(int l=0;l<even.length;l++){
            nums[e]=even[l];
            e+=2;
        }
        for(int m=odd.length-1;m>=0;m--){
            nums[o]=odd[m];
            o+=2;
        }
        return nums;
    }
}