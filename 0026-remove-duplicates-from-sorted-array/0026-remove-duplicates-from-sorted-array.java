class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k++]=nums[i+1];
            }
        }
        return k;
    }
}

/*
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> hs=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int j=0;
        for(int x: hs){
            nums[j++]=x;
        }
        return hs.size();
    }
}
*/