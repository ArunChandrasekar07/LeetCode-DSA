class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int cur=nums[0];
        int count=0;
        int freq=(nums.length/3);
        for(int i=1;i<nums.length;i++){
            if(cur==nums[i]){
                count++;
            }
            else{
                count++;
                if(count>freq){
                    l.add(cur);
                }
                cur=nums[i];
                count=0;
            }
        }
        count++;
        if(count>freq){
            l.add(cur);
        }
        return l;
    }
}