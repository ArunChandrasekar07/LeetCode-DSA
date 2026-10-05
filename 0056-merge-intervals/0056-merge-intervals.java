class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] store=new int[intervals.length][2];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int cs=intervals[0][0];
        int ce=intervals[0][1];
        int j=0;
        for(int i=1;i<intervals.length;i++){
            if(ce>=intervals[i][0]){
                ce=Math.max(ce,intervals[i][1]);
            }
            else{
                store[j][0]=cs;
                store[j][1]=ce;
                j++;
                cs=intervals[i][0];
                ce=intervals[i][1];
            }
        }
        store[j][0]=cs;
        store[j][1]=ce;
        int[][] ans=new int[j+1][2];
        for(int n=0;n<=j;n++){
            for(int m=0;m<2;m++){
                ans[n][m]=store[n][m];
            }
        }
        return ans;
    }
}