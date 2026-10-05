class Solution {
    public void gridd(char[][] grid,int k,int m,int r,int c,boolean[][] check){
        if(k>=0 && m>=0 && k<r && m<c){
            if(grid[k][m]=='0'){
               return;
            }
            if(check[k][m]==true){
               return;
            }
            check[k][m]=true;
            gridd(grid,k+1,m,r,c,check);
            gridd(grid,k-1,m,r,c,check);
            gridd(grid,k,m+1,r,c,check);
            gridd(grid,k,m-1,r,c,check);
        }
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        boolean[][] check=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && check[i][j]!=true){
                    gridd(grid,i,j,r,c,check);
                    count++;
                }
            }
        }
        return count;
    }
}