class Solution {
    public int check(int[][] grid,int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c){
            return 1;
        }
        if(grid[i][j]==0){
            return 1;
        }
        if(grid[i][j]==2){
            return 0;
        }
        grid[i][j]=2;
        return check(grid,i+1,j,r,c)+
        check(grid,i-1,j,r,c)+
        check(grid,i,j+1,r,c)+
        check(grid,i,j-1,r,c);

    }
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    ans+=check(grid,i,j,r,c);
                }
            }
        }
        return ans;
    }
}