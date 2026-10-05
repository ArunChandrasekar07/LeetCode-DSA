class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1)
                fresh++;
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int ans=0;
        int check=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int r=cell[0];
                int x=cell[1];
                if(r-1>=0 && grid[r-1][x]==1){
                    grid[r-1][x]=2;
                    q.offer(new int[]{r-1,x});
                    check++;
                    fresh--;
                   
                }
                if(r+1<row && grid[r+1][x]==1){
                    grid[r+1][x]=2;
                    q.offer(new int[]{r+1,x});
                    check++;
                    fresh--;
                   
                }
                if(x-1>=0 && grid[r][x-1]==1){
                    grid[r][x-1]=2;
                    q.offer(new int[]{r,x-1});
                    check++;
                    fresh--;
                   
                }
                if(x+1<col && grid[r][x+1]==1){
                    grid[r][x+1]=2;
                    q.offer(new int[]{r,x+1});
                    check++;
                    fresh--;
                }
            }
            if(check>0){
                ans++;
            }
            check=0;
        }
        if(fresh>0){
            return -1;
        }
        return ans;
    }
}