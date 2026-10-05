class Solution {
    public int largestAltitude(int[] gain) {
        int la=0;
        int add=0;
        for(int i=0;i<gain.length;i++){
            add+=gain[i];
            la=Math.max(la,add);
        }
        return la;
    }
}