class Solution {
    public void generate(String curr,int o,int c,int n,List<String> ans){
        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }
        if(o<n){
            generate(curr+"(",o+1,c,n,ans);
        }
        if(c<o){
            generate(curr+")",o,c+1,n,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int o=0;
        int c=0;
        generate("",o,c,n,ans);
        return ans;
    }
}