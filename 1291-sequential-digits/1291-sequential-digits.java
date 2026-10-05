class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        int min=String.valueOf(low).length();
        int max=String.valueOf(high).length();
        for(int i=min;i<=max;i++){
            for(int j=1;j<=(10-i);j++){
                int digit=j;
                int num=0;
                for(int k=0;k<i;k++){
                    num=num*10+digit;
                    digit++;
                }
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}