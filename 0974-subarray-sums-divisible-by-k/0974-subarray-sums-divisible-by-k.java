class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int ans=0;
        int add=0;
        for(int i=0;i<nums.length;i++){
            add+=nums[i];
            int rem=add%k;
            if(rem<0){
                rem+=k;
            }
            ans+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}

/* class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum%k==0){
                    ans++;
                }
            }
        }
        return ans;
    }
} */