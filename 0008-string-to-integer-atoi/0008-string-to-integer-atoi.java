class Solution {
    public int myAtoi(String s) {
        int ind=0;
        long num=0;
        int sign=1;
        while(ind<s.length() && s.charAt(ind)==' '){
            ind++;
        }
        if(ind==s.length()) return 0;
        if(s.charAt(ind)=='+'){
            sign=1;
            ind++;
        }
        else if(s.charAt(ind)=='-'){
            sign=-1;
            ind++;
        }
        for(int i=ind;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            else{
                int digit=s.charAt(i)-'0';
                num=num*10+digit;
                if(num*sign> Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                else if(num*sign < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)(num*sign);
    }
}