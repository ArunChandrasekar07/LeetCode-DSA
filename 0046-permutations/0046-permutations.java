class Solution {
    public List<List<Integer>> solve(int[] nums,List<List<Integer>> ans,List<Integer> li,boolean[] tell){
        if(li.size()==nums.length){
            ans.add(new ArrayList(li));
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(tell[i]){
                continue;
            }
            li.add(nums[i]);
            tell[i] = true;
            solve(nums,ans,li,tell);
            li.remove(li.size()-1);
            tell[i] = false;
        }
        return ans;
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] tell=new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        return solve(nums,ans,li,tell);
    }
}
/* 
class Solution {
    public List<List<Integer>> solve(int[] nums,List<List<Integer>> ans,List<Integer> li){
        if(li.size()==nums.length){
            ans.add(new ArrayList(li));
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(li.contains(nums[i])){
                continue;
            }
            li.add(nums[i]);
            solve(nums,ans,li);
            li.remove(li.size()-1);
        }
        return ans;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        return solve(nums,ans,li);
    }
} */