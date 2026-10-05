class Solution {
    public int thirdMax(int[] nums) {
        long fir=Long.MIN_VALUE;
        long sec=Long.MIN_VALUE;
        long thir=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==fir || nums[i]==sec || nums[i]==thir){
                continue;
            }
            if(nums[i]>fir){
                thir=sec;
                sec=fir;
                fir=nums[i];
            }
            else if(nums[i]>sec){
                thir=sec;
                sec=nums[i];
            }
            else if(nums[i]>thir){
                thir=nums[i];
            }
        }
        if(thir==Long.MIN_VALUE){
            return (int)fir;
        }
        else{
            return (int)thir;
        }
    }
}

/* class Solution {
    public int thirdMax(int[] nums) {
        int n=0;
        int m=0;
        HashSet<Integer> hhss=new HashSet<>();
        for(int nn:nums){
            hhss.add(nn);
        }
        if(hhss.size()<3){
            n=1;
            m=n;
        }
        else{
            n=3;
            m=n;
        }
        int[] numss=new int[hhss.size()];
        int l=0;
        for(int g:hhss){
            numss[l++]=g;
        }
        HashSet<Integer> hs=new HashSet<>();
        int max=Integer.MIN_VALUE;
        while(n!=0){
            for(int i=0;i<numss.length;i++){
                if(max<numss[i] && !hs.contains(numss[i])){
                    max=numss[i];
                }
            }
            hs.add(max);
            max=Integer.MIN_VALUE;
            n--;
        }
        while(m!=0){
            for(int num:hs){
                if(max<num){
                    max=num;
                }
            }
            if(m==1){
                return max;
            }
            hs.remove(max);
            max=Integer.MIN_VALUE;
            m--;
        }
        return max;
    }
} */