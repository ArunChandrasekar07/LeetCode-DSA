class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int l=j+1;
                int r=nums.length-1;
                if((i>0 && nums[i]==nums[i-1]) || (j>i+1 && nums[j]==nums[j-1])){
                    continue;
                }
                while(l<r){
                    long add=(long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[r];
                    if(add>target){
                        r--;
                    }
                    else if(add<target){
                        l++;
                    }
                    else{
                        List<Integer> ll=new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
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
        }
        return li;
    }
}