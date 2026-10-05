class Solution {
    public int characterReplacement(String s, int k) {
        int[] alp=new int[26];
        int len=0;
        int max=0;
        int l=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            alp[s.charAt(r)-'A']++;
            max=Math.max(max,alp[s.charAt(r)-'A']);
            len=(r-l+1)-max;
            while(len>k){
                alp[s.charAt(l)-'A']--;
                l++;
                len=(r-l+1)-max;
            }
            ans=Math.max(ans,(r-l+1));
        }
        return ans;
    }
}