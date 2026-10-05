class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}


/* class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cur=nums[0];
        int count=0;
        int max=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cur){
                count++;
            }
            else{
                count++;
                if(count>max){
                   max=count;
                   ans=cur;
                }
                cur=nums[i];
                count=0;
            }
        }
        count++;
        if(count>max){
            max=count;
            ans=cur;
        }
        return ans;
    }
} */

/* class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cur=nums[0];
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cur){
                count++;
            }
            else{
                count++;
                hm.put(cur,count);
                cur=nums[i];
                count=0;
            }
        }
        count++;
        hm.put(cur,count);
        int max=0;
        int ans=0;
        for(int x:hm.keySet()){
            if(hm.get(x)>max){
                max=hm.get(x);
                ans=x;
            }
        }
        return ans;
    }
} */