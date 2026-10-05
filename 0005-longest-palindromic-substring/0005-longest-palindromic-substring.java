class Solution {
    public boolean Ispal(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                String a=s.substring(i,j);
                if(Ispal(a) && a.length()>ans.length()){
                    ans=a;
                }
            }
        }
        return ans;
    }
}