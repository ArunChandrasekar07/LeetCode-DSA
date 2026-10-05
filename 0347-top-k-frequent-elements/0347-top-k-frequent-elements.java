class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int cur=nums[0];
        int len=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            if(cur==nums[i]){
                len++;
            }
            else{
                len++;
                hm.put(cur,len);
                cur=nums[i];
                len=0;
            }
        }
        len++;
        int[] max=new int[k];
        int h=0;
        hm.put(cur,len);
        int m=0;
        int v=0;
        while(k!=0){
        for(int n:hm.keySet()){
            if(m<hm.get(n)){
                m=hm.get(n);
                v=n;
            }
        }
        max[h++]=v;
        hm.remove(v);
        m=0;
        k--;
        }
        return max;
    }
}