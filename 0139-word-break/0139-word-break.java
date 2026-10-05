class Solution {
    HashMap<String,Boolean> memo=new HashMap<>();
    public boolean solve(String s,List<String> wordDict){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        if(s.length()==0){
            return true;
        }
        String cur="";
        for(int i=0;i<wordDict.size();i++){
            if(s.startsWith(wordDict.get(i))){
                cur=s.substring(wordDict.get(i).length());
                if(solve(cur,wordDict)){
                    memo.put(s,true);
                    return true;
                }
            }
        }
        memo.put(s,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s,wordDict);
    }
}