class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l=0;
        int r=0;
        ArrayList<List<Integer>> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            l=i+1;
            r=nums.length-1;
            while(l<r){
                ArrayList<Integer> ll=new ArrayList<>();
                int add=nums[i]+nums[l]+nums[r];
                if(add<0){
                    l++;
                }
                else if(add>0){
                    r--;
                }
                else{
                    ll.add(nums[i]);
                    ll.add(nums[l]);
                    ll.add(nums[r]);
                    li.add(ll);
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
            }
        }
        return li;
    }
}