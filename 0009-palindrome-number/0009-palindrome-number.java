class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        int l=0;
        int r=a.length()-1;
        boolean ans=true;
        while(l<r){
            char b=a.charAt(l);
            char c=a.charAt(r);
            if(!(b==c)){
                ans=false;
                break;
            }
            l++;
            r--;
        }
        return ans;
    }
}
/*
class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        String b=new StringBuilder(a).reverse().toString();
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
}
*/