class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alp1=new int[26];
        for(int i=0;i<s1.length();i++){
            alp1[s1.charAt(i)-'a']++;
        }
        int lens1=s1.length();
        for(int l=0;l<=s2.length()-lens1;l++){
            int[] alp2=new int[26];
            int r=l+lens1-1;
            for(int j=l;j<=r;j++){
                alp2[s2.charAt(j)-'a']++;
            }
            boolean same=true;
            for(int k=0;k<26;k++){
                if(alp1[k]!=alp2[k]){
                    same=false;
                    break;
                }
            }
            if(same){
                return true;
            }
        }
        return false;
    }
}