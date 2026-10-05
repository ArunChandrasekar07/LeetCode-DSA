class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int cur=pairs[0][1];
        int count=0;
        for(int i=1;i<pairs.length;i++){
            if(cur<pairs[i][0]){
                count++;
                cur=pairs[i][1];
            }
        }
        return ++count;
    }
}

/* class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int count=0;
        int cur=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(cur<pairs[i][0]){
                count++;
                cur=pairs[i][1];
            }
        }
        count++;
        return count;
    }
} */