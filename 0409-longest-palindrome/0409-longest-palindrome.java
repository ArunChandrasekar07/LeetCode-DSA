class Solution {
    public int longestPalindrome(String s) {
        int[] alp=new int[128];
        for(int i=0;i<s.length();i++){
            alp[s.charAt(i)]++;
        }
        int even=0;
        int odd=0;
        int ans=0;
        int min=0;
        for(int j=0;j<alp.length;j++){
            if(alp[j]!=0){
                if(alp[j]%2==0){
                    ans+=alp[j];
                }
                else{
                    ans+=alp[j]-1;
                    odd++;
                }
            }
        }
        if(odd>0){
            return ans+1;
        }
        return ans;
    }
}