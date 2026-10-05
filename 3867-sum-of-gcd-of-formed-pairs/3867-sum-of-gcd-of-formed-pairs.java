class Solution {
    public long gcdSum(int[] nums) {
        int[] store=new int[nums.length];
        int a=0;
        int max=nums[0];
        int k=0;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            if(max<nums[i]){
                max=nums[i];
            }
            int b=max;
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            store[k++]=a;
        }
        Arrays.sort(store);
        int l=0;
        int r=store.length-1;
        long sum=0;
        while(l<r){
            int aa=store[l];
            int bb=store[r];
            while(bb!=0){
                int temp1=bb;
                bb=aa%bb;
                aa=temp1;
            }
            sum+=(long)aa;
            l++;
            r--;
        }
        return sum;
    }
}