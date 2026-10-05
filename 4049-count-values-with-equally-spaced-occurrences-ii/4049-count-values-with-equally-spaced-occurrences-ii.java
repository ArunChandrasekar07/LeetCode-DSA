class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
        }
        for(int x:hm.keySet()){
            if(hm.get(x).size()>=3){
                boolean check=true;
                for(int i=0;i<hm.get(x).size()-2;i++){
                    int fir=(hm.get(x).get(i+1))-(hm.get(x).get(i));
                    int sec=(hm.get(x).get(i+2))-(hm.get(x).get(i+1));
                    if(fir!=sec){
                        check=false;
                    }
                }
                if(check){
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
            int[] temp=new int[nums.length];
            int l=0;
            boolean check=true;
            if(!hs.contains(nums[i])){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        temp[l++]=j;
                    }
                }
            }
            hs.add(nums[i]);
            if(count>=3){
                for(int k=0;k<l-2;k++){
                    int fir=(temp[k+1]-temp[k]);
                    int sec=(temp[k+2]-temp[k+1]);
                    if(fir!=sec){
                        check=false;
                    }
                }
                if(check)
                ans++;
            }
        }
        return ans;
    }
} */