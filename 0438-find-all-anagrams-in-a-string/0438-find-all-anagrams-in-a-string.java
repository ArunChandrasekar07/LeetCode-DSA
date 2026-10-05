class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        int[] one=new int[26];
        for(int i=0;i<p.length();i++){
            one[p.charAt(i)-'a']++;
        }
        int r=p.length()-1;
        int k=0;
        while(r<s.length()){
            int[] two=new int[26];
            for(int l=k;l<=r;l++){
                two[s.charAt(l)-'a']++;
            }
            boolean check=true;
            for(int c=0;c<26;c++){
                if(one[c]!=two[c]){
                    check=false;
                    break;
                }
            }
            if(check){
                li.add(k);
            }
            k++;
            r++;
        }
        return li;
    }
}