class Solution {
    public String minWindow(String s, String t) {
        int[] one=new int[128];
        int[] two=new int[128];
        String ans="";
        for(int i=0;i<t.length();i++){
            one[t.charAt(i)]++;
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            two[s.charAt(r)]++;
            boolean check=true;
            for(int k=0;k<one.length;k++){
                if(one[k]>two[k]){
                    check=false;
                    break;
                }
            }
            while(check){
                if(ans=="" || r-l+1<ans.length()){
                    ans=s.substring(l,r+1);
                }
                two[s.charAt(l)]--;
                l++;
                for(int k=0;k<one.length;k++){
                    if(one[k]>two[k]){
                        check=false;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}