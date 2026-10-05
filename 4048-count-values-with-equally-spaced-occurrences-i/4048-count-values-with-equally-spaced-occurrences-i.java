class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
        }
        for(int x:hm.keySet()){
            if(hm.get(x).size()==3){
                int fir=(hm.get(x).get(1))-(hm.get(x).get(0));
                int sec=(hm.get(x).get(2))-(hm.get(x).get(1));
                if(fir==sec){
                    ans++;
                }
            }
        }
        return ans;
    }
}

/* class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int space=0;
            int f=0;
            int s=0;
            int t=0;
            for(int j=0;j<nums.length;j++){
                if(!hs.contains(nums[i]) && nums[i]==nums[j]){
                    if(space==0){
                        f=j;
                        space++;
                    }
                    else if(space==1){
                        s=j;
                        space++;
                    }
                    else{
                        t=j;
                    }
                    count++;
                }
            }
            int add=(s-f);
            int add2=(t-s);
            hs.add(nums[i]);
            if(count==3 && (add==add2)){
                ans++;
            }
        }
        return ans;
    }
} */