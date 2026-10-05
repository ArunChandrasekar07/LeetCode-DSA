class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smaller=nums[0];
        int greater=nums[nums.length-1];
        while(greater!=0){
            int temp=greater;
            greater=smaller%greater;
            smaller=temp;
        }
        return smaller;
    }
}