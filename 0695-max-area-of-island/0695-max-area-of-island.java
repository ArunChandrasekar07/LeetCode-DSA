class Solution {
    public int val(int[][] grid,int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c)
        return 0;
        if(grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0; /* modify grid instead marking it as true */
        return 1+
            val(grid,i+1,j,r,c)
            +val(grid,i-1,j,r,c)
            +val(grid,i,j+1,r,c)
            +val(grid,i,j-1,r,c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        int cur=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    cur=val(grid,i,j,r,c);
                }
                if(cur>max){
                   max=cur;
                }
                cur=0;
            }
        }
        return max;
    }
}