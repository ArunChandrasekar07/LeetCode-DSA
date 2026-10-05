class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}

/* class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean ans=true;
            for(int j=0;j<s.length();j++){
                if(i!=j){
                    if(s.charAt(i)==s.charAt(j)){
                        ans=false;
                    }
                }
            }
            if(ans){
                return i;
            }
        }
        return -1;
    }
} */