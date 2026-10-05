class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        int[][] ans=new int[k][points[0].length];
        for(int i=0;i<points.length;i++){
            int temp=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            pq.add(new int[]{temp,i});
        }
        int n=0;
        while(k!=0){
            int[] temp=pq.poll();
            ans[n][0]=points[temp[1]][0];
            ans[n++][1]=points[temp[1]][1];
            k--;
        }
        return ans;
    }
}