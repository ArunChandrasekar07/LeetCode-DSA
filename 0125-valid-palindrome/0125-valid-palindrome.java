class Solution {
    public boolean isPalindrome(String s) {
        String ans=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(ans.charAt(l))){
                l++;
            }
            else if(!Character.isLetterOrDigit(ans.charAt(r))){
                r--;
            }
            else{
                if(ans.charAt(l)!=ans.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}