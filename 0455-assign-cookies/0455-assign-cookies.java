class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int i=0;
        int j=0;
        while(i < g.length && j < s.length){
            if(g[i]<=s[j]){
                ans++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}