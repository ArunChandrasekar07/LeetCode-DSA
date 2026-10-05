class Solution {
    public List<List<Integer>> solve(int[] nums,int index,List<Integer> li,List<List<Integer>> ans){
        ans.add(new ArrayList<>(li));
        if(index==nums.length){
            return ans;
        }
        for(int i=index;i<nums.length;i++){
            li.add(nums[i]);
            solve(nums,i+1,li,ans);
            li.remove(li.size()-1);
        }
        return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        int index=0;
        return solve(nums,index,li,ans);
    }
}