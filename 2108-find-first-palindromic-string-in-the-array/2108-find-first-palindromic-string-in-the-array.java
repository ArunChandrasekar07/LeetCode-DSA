class Solution {
    public static boolean check(String word){
        int l=0;
        int r=word.length()-1;
        while(l<r){
            if(word.charAt(l)!=word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            ans=words[i];
            if(check(ans)){
                return ans;
            }
        }
        return "";
    }
}