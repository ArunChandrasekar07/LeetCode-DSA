class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(hs.contains(num)){
                li.add(num);
            }
            else{
                hs.add(num);
            }
        }
        return li;
    }
}