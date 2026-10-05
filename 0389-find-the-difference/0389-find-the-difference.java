class Solution {
    public char findTheDifference(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]){
                return b[i];
            }
        }
        return b[b.length-1];
    }
}

/* class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;

        for(int i = 0; i < s.length(); i++){
            ans ^= s.charAt(i);
        }

        for(int i = 0; i < t.length(); i++){
            ans ^= t.charAt(i);
        }

        return ans;
    }
} */