class Solution {
    public String longestWord(String[] words) {
        HashSet<String> hs=new HashSet<>();
        for(String store:words){
            hs.add(store);
        }
        String ans="";
        for(int i=0;i<words.length;i++){
            boolean check=true;
            for(int j=1;j<words[i].length();j++){
                if(!hs.contains(words[i].substring(0,j))){
                    check=false;
                }
            }
            if(check){
                if(ans.length()<words[i].length()){
                    ans=words[i];
                }
                else if(ans.length()==words[i].length() && words[i].compareTo(ans)<0){
                    ans=words[i];
                }
            }
            else{
                continue;
            }
        }
        return ans;
    }
}